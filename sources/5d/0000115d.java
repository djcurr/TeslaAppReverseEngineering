package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.parser.TokenStream;
import ch.qos.logback.core.pattern.util.AsIsEscapeUtil;
import ch.qos.logback.core.pattern.util.IEscapeUtil;
import ch.qos.logback.core.spi.ScanException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class OptionTokenizer {
    private static final int EXPECTING_STATE = 0;
    private static final int QUOTED_COLLECTING_STATE = 2;
    private static final int RAW_COLLECTING_STATE = 1;
    final IEscapeUtil escapeUtil;
    final String pattern;
    final int patternLength;
    char quoteChar;
    int state;
    final TokenStream tokenStream;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OptionTokenizer(TokenStream tokenStream) {
        this(tokenStream, new AsIsEscapeUtil());
    }

    OptionTokenizer(TokenStream tokenStream, IEscapeUtil iEscapeUtil) {
        this.state = 0;
        this.tokenStream = tokenStream;
        this.pattern = tokenStream.pattern;
        this.patternLength = tokenStream.patternLength;
        this.escapeUtil = iEscapeUtil;
    }

    void emitOptionToken(List<Token> list, List<String> list2) {
        list.add(new Token(1006, list2));
        this.tokenStream.state = TokenStream.TokenizerState.LITERAL_STATE;
    }

    void escape(String str, StringBuffer stringBuffer) {
        TokenStream tokenStream = this.tokenStream;
        int i11 = tokenStream.pointer;
        if (i11 < this.patternLength) {
            String str2 = this.pattern;
            tokenStream.pointer = i11 + 1;
            this.escapeUtil.escape(str, stringBuffer, str2.charAt(i11), this.tokenStream.pointer);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void tokenize(char c11, List<Token> list) {
        String trim;
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        while (this.tokenStream.pointer < this.patternLength) {
            int i11 = this.state;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        char c12 = this.quoteChar;
                        if (c11 == c12) {
                            trim = stringBuffer.toString();
                            arrayList.add(trim);
                            stringBuffer.setLength(0);
                            this.state = 0;
                        } else {
                            if (c11 == '\\') {
                                escape(String.valueOf(c12), stringBuffer);
                            }
                            stringBuffer.append(c11);
                        }
                    }
                } else if (c11 != ',') {
                    if (c11 == '}') {
                        arrayList.add(stringBuffer.toString().trim());
                        emitOptionToken(list, arrayList);
                        return;
                    }
                    stringBuffer.append(c11);
                } else {
                    trim = stringBuffer.toString().trim();
                    arrayList.add(trim);
                    stringBuffer.setLength(0);
                    this.state = 0;
                }
            } else if (c11 != '\t' && c11 != '\n' && c11 != '\r' && c11 != ' ') {
                if (c11 == '\"' || c11 == '\'') {
                    this.state = 2;
                    this.quoteChar = c11;
                } else if (c11 == ',') {
                    continue;
                } else if (c11 == '}') {
                    emitOptionToken(list, arrayList);
                    return;
                } else {
                    stringBuffer.append(c11);
                    this.state = 1;
                }
            }
            c11 = this.pattern.charAt(this.tokenStream.pointer);
            this.tokenStream.pointer++;
        }
        if (c11 != '}') {
            throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
        }
        int i12 = this.state;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
            }
            arrayList.add(stringBuffer.toString().trim());
        }
        emitOptionToken(list, arrayList);
    }
}