package tp;

import com.henninghall.date_picker.pickers.a;

/* loaded from: classes2.dex */
public class a implements j {

    /* renamed from: a  reason: collision with root package name */
    private final sp.e f52379a;

    /* renamed from: tp.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C1158a implements a.InterfaceC0316a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ up.g f52380a;

        C1158a(up.g gVar) {
            this.f52380a = gVar;
        }

        @Override // com.henninghall.date_picker.pickers.a.InterfaceC0316a
        public void a() {
            a.this.f52379a.a(this.f52380a);
        }
    }

    public a(sp.e eVar) {
        this.f52379a = eVar;
    }

    @Override // tp.j
    public void a(up.g gVar) {
        gVar.f53653d.setOnValueChangedListener(new C1158a(gVar));
    }
}