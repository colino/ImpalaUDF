# How create Cloudera Impala custom functions (UDF) in java

compile and execute

```
create function ReplaceSpecialChar(string) returns string location '/user/cloudera/udfs/Hive-replaceStirng.jar' symbol='com.replacestring.hive.udf.ReplaceString'; 
```


'/user/cloudera/udfs/Hive-replaceStirng.jar'  is the place in HDFS where exported jar is stored




for info:
- Nicola Logrillo
- nico_ntrax@hotmail.com
