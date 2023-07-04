package ch.qos.logback.core.subst;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.subst.Token;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Tokenizer {
    final String pattern;
    final int patternLength;
    TokenizerState state = TokenizerState.LITERAL_STATE;
    int pointer = 0;

    /* renamed from: ch.qos.logback.core.subst.Tokenizer$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState;

        static {
            int[] iArr = new int[TokenizerState.values().length];
            $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState = iArr;
            try {
                iArr[TokenizerState.LITERAL_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[TokenizerState.START_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[TokenizerState.DEFAULT_VAL_STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum TokenizerState {
        LITERAL_STATE,
        START_STATE,
        DEFAULT_VAL_STATE
    }

    public Tokenizer(String str) {
        this.pattern = str;
        this.patternLength = str.length();
    }

    private void addLiteralToken(List<Token> list, StringBuilder sb2) {
        if (sb2.length() == 0) {
            return;
        }
        list.add(new Token(Token.Type.LITERAL, sb2.toString()));
    }

    private void handleDefaultValueState(char c11, List<Token> list, StringBuilder sb2) {
        TokenizerState tokenizerState;
        Token token;
        if (c11 != '$') {
            if (c11 != '-') {
                sb2.append(CoreConstants.COLON_CHAR);
                if (c11 != '{') {
                    sb2.append(c11);
                    tokenizerState = TokenizerState.LITERAL_STATE;
                } else {
                    addLiteralToken(list, sb2);
                    sb2.setLength(0);
                    token = Token.CURLY_LEFT_TOKEN;
                }
            } else {
                token = Token.DEFAULT_SEP_TOKEN;
            }
            list.add(token);
            tokenizerState = TokenizerState.LITERAL_STATE;
        } else {
            sb2.append(CoreConstants.COLON_CHAR);
            addLiteralToken(list, sb2);
            sb2.setLength(0);
            tokenizerState = TokenizerState.START_STATE;
        }
        this.state = tokenizerState;
    }

    private void handleLiteralState(char c11, List<Token> list, StringBuilder sb2) {
        TokenizerState tokenizerState;
        Token token;
        if (c11 == '$') {
            addLiteralToken(list, sb2);
            sb2.setLength(0);
            tokenizerState = TokenizerState.START_STATE;
        } else if (c11 != ':') {
            if (c11 == '{') {
                addLiteralToken(list, sb2);
                token = Token.CURLY_LEFT_TOKEN;
            } else if (c11 != '}') {
                sb2.append(c11);
                return;
            } else {
                addLiteralToken(list, sb2);
                token = Token.CURLY_RIGHT_TOKEN;
            }
            list.add(token);
            sb2.setLength(0);
            return;
        } else {
            addLiteralToken(list, sb2);
            sb2.setLength(0);
            tokenizerState = TokenizerState.DEFAULT_VAL_STATE;
        }
        this.state = tokenizerState;
    }

    private void handleStartState(char c11, List<Token> list, StringBuilder sb2) {
        if (c11 == '{') {
            list.add(Token.START_TOKEN);
        } else {
            sb2.append(CoreConstants.DOLLAR);
            sb2.append(c11);
        }
        this.state = TokenizerState.LITERAL_STATE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Token> tokenize() {
        char c11;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i11 = this.pointer;
            if (i11 >= this.patternLength) {
                break;
            }
            char charAt = this.pattern.charAt(i11);
            this.pointer++;
            int i12 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[this.state.ordinal()];
            if (i12 == 1) {
                handleLiteralState(charAt, arrayList, sb2);
            } else if (i12 == 2) {
                handleStartState(charAt, arrayList, sb2);
            } else if (i12 == 3) {
                handleDefaultValueState(charAt, arrayList, sb2);
            }
        }
        int i13 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[this.state.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 == 3) {
                    c11 = CoreConstants.COLON_CHAR;
                }
                return arrayList;
            }
            c11 = CoreConstants.DOLLAR;
            sb2.append(c11);
        }
        addLiteralToken(arrayList, sb2);
        return arrayList;
    }
}