package ecoin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ECOIN {

    public Connection connectDB() {
        Connection connection = null;
        try {
            Class.forName("org.sqlite.JDBC");
            String url;
            url = "jdbc:sqlite:E:\\Java\\ECOIN\\src\\ecoindata.db";
            connection = DriverManager.getConnection(url);
            System.out.println("Connected to SQLite database.");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Failed to connect to the database: " + e.getMessage());
        }
        return connection;
    }
////Inserting data in data base 

    public boolean insertData(String name, String mobile, String nid, String pin) {
        Connection connection = connectDB();
        boolean inserted = false;
        if (connection != null) {
            try {

                String insertQuery = "INSERT INTO signup(Name, Mobile, Nid, Pin) VALUES (?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

                preparedStatement.setString(1, name);
                preparedStatement.setString(2, mobile);
                preparedStatement.setString(3, nid);
                preparedStatement.setString(4, pin);

                int rowsInserted = preparedStatement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Data inserted successfully.");
                    inserted = true;
                }
            } catch (SQLException e) {
                System.out.println("Failed to insert data: " + e.getMessage());
            } finally {
                try {
                    connection.close();
                    System.out.println("Database connection closed.");
                } catch (SQLException e) {
                    System.out.println("Failed to close the connection: " + e.getMessage());
                }
            }
        }
        return inserted;
    }
//checking login informaton from  data base

    public boolean validateLogin(String mobile, String pin) {
        boolean isValid = false;
        Connection connection = connectDB();

        if (connection != null) {
            try {
                String query = "SELECT * FROM signup WHERE Mobile = ? AND Pin = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, mobile);
                preparedStatement.setString(2, pin);

                ResultSet resultSet = preparedStatement.executeQuery();
                isValid = resultSet.next();

                resultSet.close();
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return isValid;
    }

    //showing user name in dashboard
    public String UserName(String mobile) {
        String userName = "";

        Connection connection = connectDB();
        if (connection != null) {
            try {
                String query = "SELECT Name FROM signup WHERE Mobile = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, mobile);

                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    userName = resultSet.getString("Name");
                }

                resultSet.close();
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return userName;
    }

    //showing Balance in dashboard
    public double UserBalance(String mobile) {
        double balance = 0.0;

        Connection connection = connectDB();
        if (connection != null) {
            try {
                String query = "SELECT Balance FROM  signup WHERE Mobile = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, mobile);

                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    balance = resultSet.getDouble("Balance");
                }

                resultSet.close();
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return balance;
    }
    //showing user account in dashboard

    public String Useracc(String mobile) {
        String acc = "";

        Connection connection = connectDB();
        if (connection != null) {
            try {
                String query = "SELECT Mobile FROM  signup WHERE Mobile = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, mobile);

                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    acc = resultSet.getString("Mobile");
                }

                resultSet.close();
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return acc;
    }

    //send money 
    public boolean sendMoney(String senderMobile, String recipientMobile, double amount) {
        Connection connection = connectDB();
        boolean sent = false;
        if (connection != null) {
            try {

                double senderBalance = UserBalance(senderMobile);
                double recipientBalance = UserBalance(recipientMobile);

                if (senderBalance >= amount) {

                    double updatedSenderBalance = senderBalance - amount;
                    String updateSenderQuery = "UPDATE signup SET Balance = ? WHERE Mobile = ?";

                    PreparedStatement updateSenderStatement = connection.prepareStatement(updateSenderQuery);
                    updateSenderStatement.setDouble(1, updatedSenderBalance);
                    updateSenderStatement.setString(2, senderMobile);
                    updateSenderStatement.executeUpdate();

                    double updatedRecipientBalance = recipientBalance + amount;
                    String updateRecipientQuery = "UPDATE signup SET Balance = ? WHERE Mobile = ?";
                    PreparedStatement updateRecipientStatement = connection.prepareStatement(updateRecipientQuery);
                    updateRecipientStatement.setDouble(1, updatedRecipientBalance);
                    updateRecipientStatement.setString(2, recipientMobile);
                    updateRecipientStatement.executeUpdate();

                    sent = true;
                    System.out.println("Amount sent successfully.");
                } else {
                    System.out.println("Insufficient balance.");
                }
            } catch (SQLException e) {
                System.out.println("Failed to send money: " + e.getMessage());
            } finally {
                try {
                    connection.close();
                    System.out.println("Database connection closed.");
                } catch (SQLException e) {
                    System.out.println("Failed to close the connection: " + e.getMessage());
                }
            }
        }
        return sent;
    }

    public boolean addMoney(String mobile, double amount) {
        Connection connection = connectDB();
        boolean added = false;
        if (connection != null) {
            try {

                double currentBalance = UserBalance(mobile);

                double updatedBalance = currentBalance + amount;

                String updateBalanceQuery = "UPDATE signup SET Balance = ? WHERE Mobile = ?";
                PreparedStatement updateBalanceStatement = connection.prepareStatement(updateBalanceQuery);
                updateBalanceStatement.setDouble(1, updatedBalance);
                updateBalanceStatement.setString(2, mobile);
                updateBalanceStatement.executeUpdate();

                added = true;
                System.out.println("Amount added successfully.");
            } catch (SQLException e) {
                System.out.println("Failed to add money: " + e.getMessage());
            } finally {
                try {
                    connection.close();
                    System.out.println("Database connection closed.");
                } catch (SQLException e) {
                    System.out.println("Failed to close the connection: " + e.getMessage());
                }
            }
        }
        return added;
    }

    //paybill
    public boolean paybill(String senderMobile, double amount) {
        Connection connection = connectDB();
        boolean sent = false;
        if (connection != null) {
            try {

                double senderBalance = UserBalance(senderMobile);

                if (senderBalance >= amount) {

                    double updatedSenderBalance = senderBalance - amount;
                    String updateSenderQuery = "UPDATE signup SET Balance = ? WHERE Mobile = ?";
                    PreparedStatement updateSenderStatement = connection.prepareStatement(updateSenderQuery);
                    updateSenderStatement.setDouble(1, updatedSenderBalance);
                    updateSenderStatement.setString(2, senderMobile);
                    updateSenderStatement.executeUpdate();
                    ;

                    sent = true;
                    System.out.println("Amount sent successfully.");
                } else {
                    System.out.println("Insufficient balance.");
                }
            } catch (SQLException e) {
                System.out.println("Failed to send money: " + e.getMessage());
            } finally {
                try {
                    connection.close();
                    System.out.println("Database connection closed.");
                } catch (SQLException e) {
                    System.out.println("Failed to close the connection: " + e.getMessage());
                }
            }
        }
        return sent;
    }

    //history
    public boolean history(String num, String to, Double tamount) {
        Connection connection = connectDB();
        boolean inserted = false;
        if (connection != null) {
            try {

                String insertQuery = "INSERT INTO history (\"From\", \"To\", Tamount) VALUES (?, ?, ?)";

                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

                preparedStatement.setString(1, num);
                preparedStatement.setString(2, to);
                preparedStatement.setDouble(3, tamount);

                int rowsInserted = preparedStatement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Data inserted successfully.");
                    inserted = true;
                }
            } catch (SQLException e) {
                System.out.println("Failed to insert data: " + e.getMessage());
            } finally {
                try {
                    connection.close();
                    System.out.println("Database connection closed.");
                } catch (SQLException e) {
                    System.out.println("Failed to close the connection: " + e.getMessage());
                }
            }
        }
        return inserted;
    }

    public ResultSet getTransactionHistoryResultSet(String loggedInUserMobile) {
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = connectDB();

            String query = "SELECT * FROM history WHERE `From` = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, loggedInUserMobile);

            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {

        }

        return resultSet;
    }

}
