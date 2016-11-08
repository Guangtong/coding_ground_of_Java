Coding Ground provides you Hadoop ready terminal where you can execute all Hadoop and HDFS commands. You can develop your mapreduce programs and execute them like any other Hadoop machine.

For now you can use following command to see all the Hadoop processes runing in the background

$ps -ef


You can run one of the stock examples shipped along with Hadoop installation:
cd $HADOOP_PREFIX
# run the mapreduce
bin/hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-2.6.0.jar grep input output 'dfs[a-z.]+'

# check the output
bin/hdfs dfs -cat output/*
