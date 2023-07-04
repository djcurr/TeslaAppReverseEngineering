package com.plaid.internal;

import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelection$UserSelectionPane;

/* loaded from: classes2.dex */
public final class tb {

    /* renamed from: a  reason: collision with root package name */
    public final UserSelection$UserSelectionPane.Rendering.Selection f19536a;

    /* renamed from: b  reason: collision with root package name */
    public UserSelection$UserSelectionPane.Actions.SubmitAction.Response f19537b;

    public tb(UserSelection$UserSelectionPane.Rendering.Selection selection, UserSelection$UserSelectionPane.Actions.SubmitAction.Response response) {
        kotlin.jvm.internal.s.g(selection, "selection");
        this.f19536a = selection;
        this.f19537b = response;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tb) {
            tb tbVar = (tb) obj;
            return kotlin.jvm.internal.s.c(this.f19536a, tbVar.f19536a) && kotlin.jvm.internal.s.c(this.f19537b, tbVar.f19537b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f19536a.hashCode() * 31;
        UserSelection$UserSelectionPane.Actions.SubmitAction.Response response = this.f19537b;
        return hashCode + (response == null ? 0 : response.hashCode());
    }

    public String toString() {
        StringBuilder a11 = g4.a("SelectionWithResponses(selection=");
        a11.append(this.f19536a);
        a11.append(", response=");
        a11.append(this.f19537b);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }
}