#!/usr/bin/ruby -w

require "mysql"

begin
     # connect to the MySQL server
     conn = Mysql.new "localhost", "root", "root", "CODINGGROUND"

     rs = conn.query("select * from users")

     puts "<table style='width:100%'>"
     rs.each_hash do |row|
         printf( "<tr><td>%d</td><td>%s</td><td>%d</td><td>%s</td></tr>", 
         row['id'], row['name'], row['age'], row['sex'])
     end
     puts "</table>"

rescue Mysql::Error => e
    puts e.errno
    puts e.error
ensure
    conn.close if conn
end
