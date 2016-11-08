#!/usr/bin/perl

use DBI;
use strict;

my $driver = "mysql";
my $database = "CODINGGROUND";
my $dsn = "DBI:$driver:database=$database;mysql_socket=/home/cg/mysql/mysql.sock";
my $userid = "root";
my $password = "root";

my $dbh = DBI->connect($dsn, $userid, $password ) or die $DBI::errstr;
print "<h2>Database Connected Successully</h2>";

my $sth = $dbh->prepare("select * from users");
$sth->execute() or die $DBI::errstr;

print "<table tyle='width:100%'>";
while (my @row = $sth->fetchrow_array()) {
   my ($id, $name, $age, $sex ) = @row;
   print "<tr><td>$id</td><td>$name</td><td>$age</td><td>$sex</td></tr>";
}
print "</table>";

$sth->finish();
