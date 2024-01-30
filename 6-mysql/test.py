import mysql.connector

# Replace these with your MySQL server details
host = 'localhost'
user = 'root'
password = 'my_cwl20253'
# database = 'your_database'

# Establish a connection to the MySQL server
try:
    connection = mysql.connector.connect(
        host=host,
        user=user,
        password=password,
    )

    if connection.is_connected():
        print(
            f"Connected to MySQL server (host: {host})")

        # Perform database operations here

except mysql.connector.Error as err:
    print(f"Error: {err}")

finally:
    # Close the connection when done
    if 'connection' in locals():
        connection.close()
        print("Connection closed")
