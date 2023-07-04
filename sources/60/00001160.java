package ch.qos.logback.core.pattern.parser;

import java.util.List;

/* loaded from: classes.dex */
class Token {
    static final int COMPOSITE_KEYWORD = 1005;
    static final int CURLY_LEFT = 123;
    static final int CURLY_RIGHT = 125;
    static final int DOT = 46;
    static final int EOF = Integer.MAX_VALUE;
    static final int FORMAT_MODIFIER = 1002;
    static final int LITERAL = 1000;
    static final int MINUS = 45;
    static final int OPTION = 1006;
    static final int PERCENT = 37;
    static final int RIGHT_PARENTHESIS = 41;
    static final int SIMPLE_KEYWORD = 1004;
    private final List<String> optionsList;
    private final int type;
    private final String value;
    static Token EOF_TOKEN = new Token(Integer.MAX_VALUE, "EOF");
    static Token RIGHT_PARENTHESIS_TOKEN = new Token(41);
    static Token BARE_COMPOSITE_KEYWORD_TOKEN = new Token(1005, "BARE");
    static Token PERCENT_TOKEN = new Token(37);

    public Token(int i11) {
        this(i11, null, null);
    }

    public Token(int i11, String str) {
        this(i11, str, null);
    }

    public Token(int i11, String str, List<String> list) {
        this.type = i11;
        this.value = str;
        this.optionsList = list;
    }

    public Token(int i11, List<String> list) {
        this(i11, null, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Token) {
            Token token = (Token) obj;
            if (this.type != token.type) {
                return false;
            }
            String str = this.value;
            String str2 = token.value;
            return str == null ? str2 == null : str.equals(str2);
        }
        return false;
    }

    public List<String> getOptionsList() {
        return this.optionsList;
    }

    public int getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        int i11 = this.type * 29;
        String str = this.value;
        return i11 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str;
        StringBuilder sb2;
        String str2;
        int i11 = this.type;
        if (i11 == 37) {
            str = "%";
        } else if (i11 == 41) {
            str = "RIGHT_PARENTHESIS";
        } else if (i11 == 1000) {
            str = "LITERAL";
        } else if (i11 != 1002) {
            switch (i11) {
                case 1004:
                    str = "SIMPLE_KEYWORD";
                    break;
                case 1005:
                    str = "COMPOSITE_KEYWORD";
                    break;
                case OPTION /* 1006 */:
                    str = "OPTION";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
        } else {
            str = "FormatModifier";
        }
        if (this.value == null) {
            sb2 = new StringBuilder();
            sb2.append("Token(");
            sb2.append(str);
            str2 = ")";
        } else {
            sb2 = new StringBuilder();
            sb2.append("Token(");
            sb2.append(str);
            sb2.append(", \"");
            sb2.append(this.value);
            str2 = "\")";
        }
        sb2.append(str2);
        return sb2.toString();
    }
}