package com.swmansion.rnscreens;

import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.n0;
import com.facebook.react.views.view.ReactViewManager;
import com.swmansion.rnscreens.p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@fg.a(name = ScreenStackHeaderSubviewManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0007¨\u0006\u0011"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "", "getName", "Lcom/facebook/react/uimanager/n0;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/react/views/view/g;", "createViewInstance", "Lcom/swmansion/rnscreens/p;", "view", "type", "Lvz/b0;", "setType", "<init>", "()V", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ScreenStackHeaderSubviewManager extends ReactViewManager {
    public static final a Companion = new a(null);
    public static final String REACT_CLASS = "RNSScreenStackHeaderSubview";

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ng.a(name = "type")
    public final void setType(p view, String type) {
        p.a aVar;
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(type, "type");
        switch (type.hashCode()) {
            case -1364013995:
                if (type.equals("center")) {
                    aVar = p.a.CENTER;
                    view.setType(aVar);
                    return;
                }
                throw new JSApplicationIllegalArgumentException(kotlin.jvm.internal.s.p("Unknown type ", type));
            case 3015911:
                if (type.equals("back")) {
                    aVar = p.a.BACK;
                    view.setType(aVar);
                    return;
                }
                throw new JSApplicationIllegalArgumentException(kotlin.jvm.internal.s.p("Unknown type ", type));
            case 3317767:
                if (type.equals("left")) {
                    aVar = p.a.LEFT;
                    view.setType(aVar);
                    return;
                }
                throw new JSApplicationIllegalArgumentException(kotlin.jvm.internal.s.p("Unknown type ", type));
            case 108511772:
                if (type.equals("right")) {
                    aVar = p.a.RIGHT;
                    view.setType(aVar);
                    return;
                }
                throw new JSApplicationIllegalArgumentException(kotlin.jvm.internal.s.p("Unknown type ", type));
            default:
                throw new JSApplicationIllegalArgumentException(kotlin.jvm.internal.s.p("Unknown type ", type));
        }
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.view.g createViewInstance(n0 context) {
        kotlin.jvm.internal.s.g(context, "context");
        return new p(context);
    }
}