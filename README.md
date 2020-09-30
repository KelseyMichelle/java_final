Final Project for CSi 254

Employee Database Program
Author: Kelsey Gregware

Username/Password file format: username;password;userID

Employee file format: firstname;lastname;userid;accesslevel;lastfour

There are three levels of access for users:

0 - Read only access
	Can only read the data in the database
1 - Read/Write access
	Can read and modify the data in the database
2 - No access
	Can neither read nor write data in the database

Attempting to create a login user without a corresponding employee will result in an error

Attempting to create a login user with only level 2 access will result in an error

You may log into an account that has level 2 access if it has
already been created, however you will be blocked from seeing any data in the app.

An account that has login credentials but no corresponding employee will fail to log in

Changes are not finalized until the "Save to File" button has been used.

Initial user tests:

username: Kelsey, password: g, access level: 1
username: tofu, password: g, access level: 0
username: guest, password: guest, access level: 2
username: test, password: test, access level: N/A
