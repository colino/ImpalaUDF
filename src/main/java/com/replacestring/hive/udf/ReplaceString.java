package com.replacestring.hive.udf;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.io.Text;

/*
	@Description(
		name = "replacestring",
		value = "_FUNC_(str) - replace a some special chars in a string",
		extended = "Example: > SELECT ReplaceString(string) FROM table a;"
	)
*/
public class ReplaceString extends UDF {

	public Text evaluate(Text s) {
	
	String s_tmp = s.toString();
	
	s_tmp = s_tmp.replace("à", "a");
	s_tmp = s_tmp.replace("á", "a");
	s_tmp = s_tmp.replace("è", "e");
	s_tmp = s_tmp.replace("é", "e");
	s_tmp = s_tmp.replace("ì", "i");
	s_tmp = s_tmp.replace("ò", "o");
	s_tmp = s_tmp.replace("ù", "u");
	s_tmp = s_tmp.replace("ç", "c");
	
	Text new_s = new Text(s_tmp);
	
	return new_s;
	
	}

} 