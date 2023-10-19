package java6prac.builder;
import java.util.Stack;

class MyStringBuilder {
    private StringBuilder stringBuilder;
    private Stack<String> history;

    public MyStringBuilder() {
        stringBuilder = new StringBuilder();
        history = new Stack<>();
    }

    public void append(String str) {
        stringBuilder.append(str);
        history.push("append " + str);
    }

    public void delete(int start, int end) {
        String deleted = stringBuilder.substring(start, end);
        stringBuilder.delete(start, end);
        history.push("delete [" + start + "," + end + "): " + deleted);
    }

    public void undo() {
        if (!history.isEmpty()) {
            String lastOperation = history.pop();
            if (lastOperation.startsWith("append")) {
                int spaceIndex = lastOperation.indexOf(' ');
                String appended = lastOperation.substring(spaceIndex + 1);
                stringBuilder.delete(stringBuilder.length() - appended.length(), stringBuilder.length());
            } else if (lastOperation.startsWith("delete")) {
                int colonIndex = lastOperation.indexOf(':');
                int endIndex = lastOperation.indexOf(')');
                int startIndex = lastOperation.indexOf('[') + 1;
                String substring = lastOperation.substring(startIndex, endIndex);
                int start = Integer.parseInt(substring.split(",")[0]);
                int end = Integer.parseInt(substring.split(",")[1]);
                String deleted = lastOperation.substring(colonIndex + 2);
                stringBuilder.insert(start, deleted);
            }
        }
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}


