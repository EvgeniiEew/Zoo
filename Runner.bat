cd C:\Users\Jack\Desktop\Zoo
dir /s/b/o *.java >sourse
javac -d target -cp .\lib\gson-2.8.6.jar @sourse
del sourse
java -cp ./target;./lib/gson-2.8.6.jar by.home.zoo.Runner
pause
