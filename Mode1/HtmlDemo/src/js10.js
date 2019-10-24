function strDemo() {
	var res=" ";
	var str="welcome to HTML programming...";
	var len=str.length;
	res +="Length is " + len + "<br/>";
	res +="Lower-Case String is <b>" + str.toLowerCase() + "</b><br/>";
	res +="Upper-Case String is <b>" + str.toUpperCase() + "</b><br/>";
	res +="First Occurence of 'a' is <b>" + str.indexOf("a") + "</b><br/>";
	res +="Char at 5th position is <b>" + str.charAt(5) + "</b><br/>";
	res +="Replaced String is <b>" + str.replace("HTML","HTML 5") + "</b><br/>";
	
	document.getElementById("res").innerHTML = res;
}