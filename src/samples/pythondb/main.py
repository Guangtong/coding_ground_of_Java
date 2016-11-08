#!/usr/bin/python

import MySQLdb

database = "CODINGGROUND"
username = 'root'
password = 'root'

# Open database connection
db = MySQLdb.connect(unix_socket='/home/cg/mysql/mysql.sock', host='localhost', user=username, passwd=password, db=database )

# prepare a cursor object using cursor() method
cursor = db.cursor()

sql = "select * from users"

try:
   cursor.execute(sql)
   results = cursor.fetchall()
   print "<table style='width:100%'>"
   for row in results:
      id   = row[0]
      name = row[1]
      age  = row[2]
      sex  = row[3]
      print "<tr><td>%d</td><td>%s</td><td>%d</td><td>%s</td></tr>"%  (id, name, age, sex)

   print "</table>"
except:
   print "Error: unable to fecth data"

db.close()
