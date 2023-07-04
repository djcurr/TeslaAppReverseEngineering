package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.FormatInfo;
import ch.qos.logback.core.pattern.IdentityCompositeConverter;
import ch.qos.logback.core.pattern.ReplacingCompositeConverter;
import ch.qos.logback.core.pattern.util.IEscapeUtil;
import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.ScanException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class Parser<E> extends ContextAwareBase {
    public static final Map<String, String> DEFAULT_COMPOSITE_CONVERTER_MAP;
    public static final String MISSING_RIGHT_PARENTHESIS = "http://logback.qos.ch/codes.html#missingRightParenthesis";
    public static final String REPLACE_CONVERTER_WORD = "replace";
    int pointer;
    final List<Token> tokenList;

    static {
        HashMap hashMap = new HashMap();
        DEFAULT_COMPOSITE_CONVERTER_MAP = hashMap;
        hashMap.put(Token.BARE_COMPOSITE_KEYWORD_TOKEN.getValue().toString(), IdentityCompositeConverter.class.getName());
        hashMap.put(REPLACE_CONVERTER_WORD, ReplacingCompositeConverter.class.getName());
    }

    Parser(TokenStream tokenStream) {
        this.pointer = 0;
        this.tokenList = tokenStream.tokenize();
    }

    public Parser(String str) {
        this(str, new RegularEscapeUtil());
    }

    public Parser(String str, IEscapeUtil iEscapeUtil) {
        this.pointer = 0;
        try {
            this.tokenList = new TokenStream(str, iEscapeUtil).tokenize();
        } catch (IllegalArgumentException e11) {
            throw new ScanException("Failed to initialize Parser", e11);
        }
    }

    FormattingNode C() {
        Token curentToken = getCurentToken();
        expectNotNull(curentToken, "a LEFT_PARENTHESIS or KEYWORD");
        int type = curentToken.getType();
        if (type != 1004) {
            if (type == 1005) {
                advanceTokenPointer();
                return COMPOSITE(curentToken.getValue().toString());
            }
            throw new IllegalStateException("Unexpected token " + curentToken);
        }
        return SINGLE();
    }

    FormattingNode COMPOSITE(String str) {
        CompositeNode compositeNode = new CompositeNode(str);
        compositeNode.setChildNode(E());
        Token nextToken = getNextToken();
        if (nextToken != null && nextToken.getType() == 41) {
            Token curentToken = getCurentToken();
            if (curentToken != null && curentToken.getType() == 1006) {
                compositeNode.setOptions(curentToken.getOptionsList());
                advanceTokenPointer();
            }
            return compositeNode;
        }
        String str2 = "Expecting RIGHT_PARENTHESIS token but got " + nextToken;
        addError(str2);
        addError("See also http://logback.qos.ch/codes.html#missingRightParenthesis");
        throw new ScanException(str2);
    }

    Node E() {
        Node T = T();
        if (T == null) {
            return null;
        }
        Node Eopt = Eopt();
        if (Eopt != null) {
            T.setNext(Eopt);
        }
        return T;
    }

    Node Eopt() {
        if (getCurentToken() == null) {
            return null;
        }
        return E();
    }

    FormattingNode SINGLE() {
        SimpleKeywordNode simpleKeywordNode = new SimpleKeywordNode(getNextToken().getValue());
        Token curentToken = getCurentToken();
        if (curentToken != null && curentToken.getType() == 1006) {
            simpleKeywordNode.setOptions(curentToken.getOptionsList());
            advanceTokenPointer();
        }
        return simpleKeywordNode;
    }

    Node T() {
        Token curentToken = getCurentToken();
        expectNotNull(curentToken, "a LITERAL or '%'");
        int type = curentToken.getType();
        if (type != 37) {
            if (type != 1000) {
                return null;
            }
            advanceTokenPointer();
            return new Node(0, curentToken.getValue());
        }
        advanceTokenPointer();
        Token curentToken2 = getCurentToken();
        expectNotNull(curentToken2, "a FORMAT_MODIFIER, SIMPLE_KEYWORD or COMPOUND_KEYWORD");
        if (curentToken2.getType() == 1002) {
            FormatInfo valueOf = FormatInfo.valueOf(curentToken2.getValue());
            advanceTokenPointer();
            FormattingNode C = C();
            C.setFormatInfo(valueOf);
            return C;
        }
        return C();
    }

    void advanceTokenPointer() {
        this.pointer++;
    }

    public Converter<E> compile(Node node, Map<String, String> map) {
        Compiler compiler = new Compiler(node, map);
        compiler.setContext(this.context);
        return compiler.compile();
    }

    void expectNotNull(Token token, String str) {
        if (token != null) {
            return;
        }
        throw new IllegalStateException("All tokens consumed but was expecting " + str);
    }

    Token getCurentToken() {
        if (this.pointer < this.tokenList.size()) {
            return this.tokenList.get(this.pointer);
        }
        return null;
    }

    Token getNextToken() {
        if (this.pointer < this.tokenList.size()) {
            List<Token> list = this.tokenList;
            int i11 = this.pointer;
            this.pointer = i11 + 1;
            return list.get(i11);
        }
        return null;
    }

    public Node parse() {
        return E();
    }
}