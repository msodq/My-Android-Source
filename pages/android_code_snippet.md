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
