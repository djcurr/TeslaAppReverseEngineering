package yw;

import ezvcard.VCard;
import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.EmbeddedVCardException;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Agent;
import ezvcard.property.VCardProperty;

/* loaded from: classes5.dex */
public class b extends g1<Agent> {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class a implements EmbeddedVCardException.a {

        /* renamed from: a  reason: collision with root package name */
        private final Agent f59902a;

        public a(Agent agent) {
            this.f59902a = agent;
        }

        @Override // ezvcard.io.EmbeddedVCardException.a
        public VCardProperty d() {
            return this.f59902a;
        }

        @Override // ezvcard.io.EmbeddedVCardException.a
        public void e(VCard vCard) {
            this.f59902a.setVCard(vCard);
        }
    }

    public b() {
        super(Agent.class, "AGENT");
    }

    @Override // yw.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.g1
    /* renamed from: i */
    public Agent b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ww.a aVar) {
        Agent agent = new Agent();
        if (vCardDataType != null) {
            agent.setUrl(ih.e.f(str));
            return agent;
        }
        throw new EmbeddedVCardException(new a(agent));
    }
}