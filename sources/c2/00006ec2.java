package freemarker.core;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.Writer;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes5.dex */
public class o {

    /* renamed from: a */
    public static final Set f26897a;

    static {
        TreeSet treeSet = new TreeSet();
        treeSet.add("assign");
        treeSet.add("attempt");
        treeSet.add("break");
        treeSet.add("call");
        treeSet.add("case");
        treeSet.add("comment");
        treeSet.add("compress");
        treeSet.add("default");
        treeSet.add("else");
        treeSet.add("elseif");
        treeSet.add("elseIf");
        treeSet.add("escape");
        treeSet.add("fallback");
        treeSet.add("flush");
        treeSet.add("foreach");
        treeSet.add("forEach");
        treeSet.add("ftl");
        treeSet.add("function");
        treeSet.add("global");
        treeSet.add("if");
        treeSet.add("import");
        treeSet.add("include");
        treeSet.add("items");
        treeSet.add("list");
        treeSet.add(ImagesContract.LOCAL);
        treeSet.add("lt");
        treeSet.add("macro");
        treeSet.add("nested");
        treeSet.add("noescape");
        treeSet.add("noEscape");
        treeSet.add("noparse");
        treeSet.add("noParse");
        treeSet.add("nt");
        treeSet.add("recover");
        treeSet.add("recurse");
        treeSet.add("return");
        treeSet.add("rt");
        treeSet.add("sep");
        treeSet.add("setting");
        treeSet.add("stop");
        treeSet.add("switch");
        treeSet.add("t");
        treeSet.add("transform");
        treeSet.add("visit");
        f26897a = Collections.unmodifiableSet(treeSet);
    }

    public static k[] a(c cVar) {
        return cVar.e();
    }

    public static void b(k[] kVarArr, boolean z11, Writer writer) {
        c.g(kVarArr, z11, writer);
    }
}