package net.time4j.i18n;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.format.y;
import net.time4j.x0;

/* loaded from: classes5.dex */
public class i implements y {

    /* renamed from: a  reason: collision with root package name */
    private final String f41453a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<String> f41454b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, x0> f41455c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, x0> f41456d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, x0> f41457e;

    public i() {
        String substring;
        x0 x0Var;
        HashMap hashMap;
        URI f11 = net.time4j.base.d.c().f("i18n", i.class, "data/week.data");
        InputStream e11 = net.time4j.base.d.c().e(f11, true);
        if (e11 == null) {
            try {
                e11 = net.time4j.base.d.c().d(i.class, "data/week.data", true);
            } catch (IOException unused) {
            }
        }
        if (e11 != null) {
            this.f41453a = "@" + f11;
            HashSet hashSet = new HashSet();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(e11, "US-ASCII"));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            if (!readLine.startsWith("#")) {
                                int indexOf = readLine.indexOf(61);
                                int i11 = 0;
                                String trim = readLine.substring(0, indexOf).trim();
                                String[] split = readLine.substring(indexOf + 1).split(" ");
                                if (trim.equals("minDays-4")) {
                                    int length = split.length;
                                    while (i11 < length) {
                                        String upperCase = split[i11].trim().toUpperCase(Locale.US);
                                        if (!upperCase.isEmpty()) {
                                            hashSet.add(upperCase);
                                        }
                                        i11++;
                                    }
                                } else {
                                    if (trim.startsWith("start-")) {
                                        substring = trim.substring(6);
                                        x0Var = x0.SATURDAY;
                                        hashMap = hashMap3;
                                    } else if (trim.startsWith("end-")) {
                                        substring = trim.substring(4);
                                        x0Var = x0.SUNDAY;
                                        hashMap = hashMap4;
                                    } else if (trim.startsWith("first-")) {
                                        substring = trim.substring(6);
                                        x0Var = x0.MONDAY;
                                        hashMap = hashMap2;
                                    } else {
                                        throw new IllegalStateException("Unexpected format: " + this.f41453a);
                                    }
                                    if (substring.equals("sun")) {
                                        x0Var = x0.SUNDAY;
                                    } else if (substring.equals("sat")) {
                                        x0Var = x0.SATURDAY;
                                    } else if (substring.equals("fri")) {
                                        x0Var = x0.FRIDAY;
                                    } else if (substring.equals("thu")) {
                                        x0Var = x0.THURSDAY;
                                    } else if (substring.equals("wed")) {
                                        x0Var = x0.WEDNESDAY;
                                    } else if (substring.equals("tue")) {
                                        x0Var = x0.TUESDAY;
                                    } else if (substring.equals("mon")) {
                                        x0Var = x0.MONDAY;
                                    }
                                    int length2 = split.length;
                                    while (i11 < length2) {
                                        String upperCase2 = split[i11].trim().toUpperCase(Locale.US);
                                        if (!upperCase2.isEmpty()) {
                                            hashMap.put(upperCase2, x0Var);
                                        }
                                        i11++;
                                    }
                                }
                            }
                        } else {
                            this.f41454b = Collections.unmodifiableSet(hashSet);
                            this.f41455c = Collections.unmodifiableMap(hashMap2);
                            this.f41456d = Collections.unmodifiableMap(hashMap3);
                            this.f41457e = Collections.unmodifiableMap(hashMap4);
                            try {
                                e11.close();
                                return;
                            } catch (IOException e12) {
                                e12.printStackTrace(System.err);
                                return;
                            }
                        }
                    }
                } catch (UnsupportedEncodingException e13) {
                    throw new AssertionError(e13);
                } catch (Exception e14) {
                    throw new IllegalStateException("Unexpected format: " + this.f41453a, e14);
                }
            } catch (Throwable th2) {
                try {
                    e11.close();
                } catch (IOException e15) {
                    e15.printStackTrace(System.err);
                }
                throw th2;
            }
        } else {
            this.f41453a = "@STATIC";
            this.f41454b = Collections.emptySet();
            this.f41455c = Collections.emptyMap();
            this.f41456d = Collections.emptyMap();
            this.f41457e = Collections.emptyMap();
            PrintStream printStream = System.err;
            printStream.println("Warning: File \"data/week.data\" not found.");
        }
    }

    @Override // net.time4j.format.y
    public int a(Locale locale) {
        String country = locale.getCountry();
        x0 x0Var = x0.SUNDAY;
        if (this.f41457e.containsKey(country)) {
            x0Var = this.f41457e.get(country);
        }
        return x0Var.getValue();
    }

    @Override // net.time4j.format.y
    public int b(Locale locale) {
        if (this.f41454b.isEmpty()) {
            return new GregorianCalendar(locale).getMinimalDaysInFirstWeek();
        }
        String country = locale.getCountry();
        return ((country.isEmpty() && locale.getLanguage().isEmpty()) || this.f41454b.contains(country)) ? 4 : 1;
    }

    @Override // net.time4j.format.y
    public int c(Locale locale) {
        String country = locale.getCountry();
        x0 x0Var = x0.SATURDAY;
        if (this.f41456d.containsKey(country)) {
            x0Var = this.f41456d.get(country);
        }
        return x0Var.getValue();
    }

    @Override // net.time4j.format.y
    public int d(Locale locale) {
        if (this.f41455c.isEmpty()) {
            int firstDayOfWeek = new GregorianCalendar(locale).getFirstDayOfWeek();
            if (firstDayOfWeek == 1) {
                return 7;
            }
            return firstDayOfWeek - 1;
        }
        String country = locale.getCountry();
        x0 x0Var = x0.MONDAY;
        if (this.f41455c.containsKey(country)) {
            x0Var = this.f41455c.get(country);
        }
        return x0Var.getValue();
    }

    public String toString() {
        return i.class.getName() + this.f41453a;
    }
}