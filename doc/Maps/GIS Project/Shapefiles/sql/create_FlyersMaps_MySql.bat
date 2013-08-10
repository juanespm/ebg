mysql -uroot -pmysql -e "CREATE DATABASE FlyersMaps;"

mysql -uroot -pmysql < blocks.sql

mysql -uroot -pmysql < pavilions.sql

mysql -uroot -pmysql < stands.sql