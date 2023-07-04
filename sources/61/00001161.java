package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.util.IEscapeUtil;
import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import ch.qos.logback.core.pattern.util.RestrictedEscapeUtil;
import ch.qos.logback.core.spi.ScanException;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TokenStream {
    final IEscapeUtil escapeUtil;
    final IEscapeUtil optionEscapeUtil;
    final String pattern;
    final int patternLength;
    int pointer;
    TokenizerState state;

    /* renamed from: ch.qos.logback.core.pattern.parser.TokenStream$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState;

        static {
            int[] iArr = new int[TokenizerState.values().length];
            $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState = iArr;
            try {
                iArr[TokenizerState.LITERAL_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.FORMAT_MODIFIER_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.OPTION_STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.KEYWORD_STATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.RIGHT_PARENTHESIS_STATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum TokenizerState {
        LITERAL_STATE,
        FORMAT_MODIFIER_STATE,
        KEYWORD_STATE,
        OPTION_STATE,
        RIGHT_PARENTHESIS_STATE
    }

    TokenStream(String str) {
        this(str, new RegularEscapeUtil());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TokenStream(String str, IEscapeUtil iEscapeUtil) {
        this.optionEscapeUtil = new RestrictedEscapeUtil();
        this.state = TokenizerState.LITERAL_STATE;
        this.pointer = 0;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("null or empty pattern string not allowed");
        }
        this.pattern = str;
        this.patternLength = str.length();
        this.escapeUtil = iEscapeUtil;
    }

    private void addValuedToken(int i11, StringBuffer stringBuffer, List<Token> list) {
        if (stringBuffer.length() > 0) {
            list.add(new Token(i11, stringBuffer.toString()));
            stringBuffer.setLength(0);
        }
    }

    private void handleFormatModifierState(char c11, List<Token> list, StringBuffer stringBuffer) {
        if (c11 == '(') {
            addValuedToken(1002, stringBuffer, list);
            list.add(Token.BARE_COMPOSITE_KEYWORD_TOKEN);
            this.state = TokenizerState.LITERAL_STATE;
            return;
        }
        if (Character.isJavaIdentifierStart(c11)) {
            addValuedToken(1002, stringBuffer, list);
            this.state = TokenizerState.KEYWORD_STATE;
        }
        stringBuffer.append(c11);
    }

    private void handleKeywordState(char c11, List<Token> list, StringBuffer stringBuffer) {
        TokenizerState tokenizerState;
        if (Character.isJavaIdentifierPart(c11)) {
            stringBuffer.append(c11);
            return;
        }
        if (c11 == '{') {
            addValuedToken(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, stringBuffer, list);
            tokenizerState = TokenizerState.OPTION_STATE;
        } else {
            if (c11 == '(') {
                addValuedToken(1005, stringBuffer, list);
            } else if (c11 == '%') {
                addValuedToken(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, stringBuffer, list);
                list.add(Token.PERCENT_TOKEN);
                tokenizerState = TokenizerState.FORMAT_MODIFIER_STATE;
            } else {
                addValuedToken(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, stringBuffer, list);
                if (c11 == ')') {
                    tokenizerState = TokenizerState.RIGHT_PARENTHESIS_STATE;
                } else if (c11 == '\\') {
                    int i11 = this.pointer;
                    if (i11 < this.patternLength) {
                        String str = this.pattern;
                        this.pointer = i11 + 1;
                        this.escapeUtil.escape("%()", stringBuffer, str.charAt(i11), this.pointer);
                    }
                } else {
                    stringBuffer.append(c11);
                }
            }
            tokenizerState = TokenizerState.LITERAL_STATE;
        }
        this.state = tokenizerState;
    }

    private void handleLiteralState(char c11, List<Token> list, StringBuffer stringBuffer) {
        TokenizerState tokenizerState;
        if (c11 == '%') {
            addValuedToken(1000, stringBuffer, list);
            list.add(Token.PERCENT_TOKEN);
            tokenizerState = TokenizerState.FORMAT_MODIFIER_STATE;
        } else if (c11 != ')') {
            if (c11 != '\\') {
                stringBuffer.append(c11);
                return;
            } else {
                escape("%()", stringBuffer);
                return;
            }
        } else {
            addValuedToken(1000, stringBuffer, list);
            tokenizerState = TokenizerState.RIGHT_PARENTHESIS_STATE;
        }
        this.state = tokenizerState;
    }

    private void handleRightParenthesisState(char c11, List<Token> list, StringBuffer stringBuffer) {
        TokenizerState tokenizerState;
        list.add(Token.RIGHT_PARENTHESIS_TOKEN);
        if (c11 != ')') {
            if (c11 == '\\') {
                escape("%{}", stringBuffer);
            } else if (c11 == '{') {
                tokenizerState = TokenizerState.OPTION_STATE;
                this.state = tokenizerState;
            } else {
                stringBuffer.append(c11);
            }
            tokenizerState = TokenizerState.LITERAL_STATE;
            this.state = tokenizerState;
        }
    }

    private void processOption(char c11, List<Token> list, StringBuffer stringBuffer) {
        new OptionTokenizer(this).tokenize(c11, list);
    }

    void escape(String str, StringBuffer stringBuffer) {
        int i11 = this.pointer;
        if (i11 < this.patternLength) {
            String str2 = this.pattern;
            this.pointer = i11 + 1;
            this.escapeUtil.escape(str, stringBuffer, str2.charAt(i11), this.pointer);
        }
    }

    void optionEscape(String str, StringBuffer stringBuffer) {
        int i11 = this.pointer;
        if (i11 < this.patternLength) {
            String str2 = this.pattern;
            this.pointer = i11 + 1;
            this.optionEscapeUtil.escape(str, stringBuffer, str2.charAt(i11), this.pointer);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Token> tokenize() {
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            int i11 = this.pointer;
            if (i11 >= this.patternLength) {
                break;
            }
            char charAt = this.pattern.charAt(i11);
            this.pointer++;
            int i12 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[this.state.ordinal()];
            if (i12 == 1) {
                handleLiteralState(charAt, arrayList, stringBuffer);
            } else if (i12 == 2) {
                handleFormatModifierState(charAt, arrayList, stringBuffer);
            } else if (i12 == 3) {
                processOption(charAt, arrayList, stringBuffer);
            } else if (i12 == 4) {
                handleKeywordState(charAt, arrayList, stringBuffer);
            } else if (i12 == 5) {
                handleRightParenthesisState(charAt, arrayList, stringBuffer);
            }
        }
        int i13 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[this.state.ordinal()];
        if (i13 == 1) {
            addValuedToken(1000, stringBuffer, arrayList);
        } else if (i13 == 2 || i13 == 3) {
            throw new ScanException("Unexpected end of pattern string");
        } else {
            if (i13 == 4) {
                arrayList.add(new Token((int) GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, stringBuffer.toString()));
            } else if (i13 == 5) {
                arrayList.add(Token.RIGHT_PARENTHESIS_TOKEN);
            }
        }
        return arrayList;
    }
}