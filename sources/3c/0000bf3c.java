package xa;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final List<ImageHeaderParser> f57346a = new ArrayList();

    public synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.f57346a.add(imageHeaderParser);
    }

    public synchronized List<ImageHeaderParser> b() {
        return this.f57346a;
    }
}