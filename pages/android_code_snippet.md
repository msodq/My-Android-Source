Android Code Snippet
===========================
* Convert array String to String with comma
```
public static String convertArrayStringToCommaSeparated(String[] strings) {
	StringBuffer sb = new StringBuffer("");
	for (int i = 0; strings != null && i < strings.length; i++) {
		sb.append(strings[i]);
		if (i < strings.length - 1) {
			sb.append(',');
		}
	}
	return sb.toString();
}
```

* Change a date format into other date format
```
public static String changeDateFormat(String date) {
	String textNewDate = "";
	DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z"); //change "yyyy-MM-dd HH:mm:ss z" with your current date format
	DateFormat dfNew = new SimpleDateFormat("dd MMMM yyyy, hh:mm aa"); //change "dd MMMM yyyy, hh:mm aa" with new date format
	try {
		Date newDate = df.parse(date);
		textNewDate = dfNew.format(newDate);
	} catch (ParseException e) {}
	return textNewDate;
}
```


* Auto close AlertDialog after a specific time
```
public void showAlertDialogWithAutoClose() {
        AlertDialog.Builder builder = new AlertDialog.Builder(
                 getApplicationContext());
        builder.setTitle("Title")
                .setMessage("message")
                .setCancelable(false);
        final AlertDialog alertDialog = builder.create();
        alertDialog.show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
	            if (alertDialog.isShowing())
	                alertDialog.dismiss();
            }
        }, 5000); //change 5000 with a specific time you want
    }
```
