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

* Remove enter from string
```
	String str = "this is your string";
	str = str.replace("\n", "").replace("\r", "");
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
	AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
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

* Delete instantly SPACE from an edittext if pressed the SPACE
```
EditText et = (EditText) findViewById(R.id.et);
et.addTextChangedListener(new TextWatcher() {

	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {
	}

	@Override
	public void beforeTextChanged(CharSequence s, int start, int count, int after) {
	}

	@Override
	public void afterTextChanged(Editable s) {
		String result = s.toString().replaceAll(" ", "");
		if (!s.toString().equals(result)) {
			et.setText(result);
			et.setSelection(result.length());
      	}
	}
});
```

* Get Enum Value from String
```
    public enum State {
        stateA, stateB, stateC, stateD, stateE
    }

    public static State getState(String str) {
        for (State state : State.values()) {
            if (state.name().equalsIgnoreCase(str))
                return state;
        }
        return null;
    }

    //this to implement the function
    String state = "stateA";
    State stateValue = getState(state);
    if (stateValue != null) {
        //not null
    }else{
        //if null
    }
```

* When press back button from MainActivity not logged out
```
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent startMain = new Intent(Intent.ACTION_MAIN);
            startMain.addCategory(Intent.CATEGORY_HOME);
            startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(startMain);
        }
        return false;
    }
```
