package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.ContextAwareBase;
import j$.retarget.C$r8$retargetLibraryMember$virtualDispatch$GregorianCalendar$toZonedDateTime$dispatchInterface;
import j$.time.ZonedDateTime;
import j$.util.DesugarGregorianCalendar;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class RollingCalendar extends GregorianCalendar implements C$r8$retargetLibraryMember$virtualDispatch$GregorianCalendar$toZonedDateTime$dispatchInterface {
    static final TimeZone GMT_TIMEZONE = DesugarTimeZone.getTimeZone("GMT");
    private static final HashMap<Character, PeriodicityType> PATTERN_LETTER_TO_PERIODICITY;
    private static final long serialVersionUID = -5937537740925066161L;
    private String datePattern;
    private PeriodicityType periodicityType;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ch.qos.logback.core.rolling.helper.RollingCalendar$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType;

        static {
            int[] iArr = new int[PeriodicityType.values().length];
            $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType = iArr;
            try {
                iArr[PeriodicityType.TOP_OF_HOUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[PeriodicityType.TOP_OF_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[PeriodicityType.TOP_OF_WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[PeriodicityType.TOP_OF_MILLISECOND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[PeriodicityType.TOP_OF_SECOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[PeriodicityType.TOP_OF_MINUTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[PeriodicityType.HALF_DAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[PeriodicityType.TOP_OF_MONTH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PATTERN_LETTER_TO_PERIODICITY = linkedHashMap;
        linkedHashMap.put('S', PeriodicityType.TOP_OF_MILLISECOND);
        linkedHashMap.put('s', PeriodicityType.TOP_OF_SECOND);
        linkedHashMap.put('m', PeriodicityType.TOP_OF_MINUTE);
        PeriodicityType periodicityType = PeriodicityType.TOP_OF_HOUR;
        linkedHashMap.put('h', periodicityType);
        linkedHashMap.put('K', periodicityType);
        linkedHashMap.put('k', periodicityType);
        linkedHashMap.put('H', periodicityType);
        linkedHashMap.put('a', PeriodicityType.HALF_DAY);
        PeriodicityType periodicityType2 = PeriodicityType.TOP_OF_DAY;
        linkedHashMap.put('u', periodicityType2);
        linkedHashMap.put('E', periodicityType2);
        linkedHashMap.put('F', periodicityType2);
        linkedHashMap.put('d', periodicityType2);
        linkedHashMap.put('D', periodicityType2);
        PeriodicityType periodicityType3 = PeriodicityType.TOP_OF_WEEK;
        linkedHashMap.put('W', periodicityType3);
        linkedHashMap.put('w', periodicityType3);
        linkedHashMap.put('M', PeriodicityType.TOP_OF_MONTH);
        linkedHashMap.put('Y', periodicityType3);
    }

    public RollingCalendar(String str) {
        this(str, GMT_TIMEZONE, Locale.US);
    }

    public RollingCalendar(String str, TimeZone timeZone, Locale locale) {
        super(timeZone, locale);
        this.periodicityType = PeriodicityType.ERRONEOUS;
        this.datePattern = str;
        this.periodicityType = computePeriodicityType();
    }

    private boolean collision(long j11) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.datePattern, Locale.US);
        simpleDateFormat.setTimeZone(GMT_TIMEZONE);
        return simpleDateFormat.format(new Date(0L)).equals(simpleDateFormat.format(new Date(j11)));
    }

    private void roundDownTime(Calendar calendar, String str) {
        if (str.indexOf(83) == -1) {
            calendar.roll(14, -calendar.get(14));
        }
        if (str.indexOf(115) == -1) {
            calendar.roll(13, -calendar.get(13));
        }
        if (str.indexOf(109) == -1) {
            calendar.roll(12, -calendar.get(12));
        }
        if (!Pattern.compile("[hKkH]").matcher(str).find()) {
            calendar.roll(11, -calendar.get(11));
        }
        if (!Pattern.compile("[uEFdD]").matcher(str).find()) {
            calendar.set(5, 1);
        }
        if (Pattern.compile("[MDw]").matcher(str).find()) {
            return;
        }
        calendar.set(2, 0);
    }

    public PeriodicityType computePeriodicityType() {
        if (this.datePattern != null) {
            for (Map.Entry<Character, PeriodicityType> entry : PATTERN_LETTER_TO_PERIODICITY.entrySet()) {
                if (this.datePattern.indexOf(entry.getKey().charValue()) > -1) {
                    return entry.getValue();
                }
            }
        }
        return PeriodicityType.ERRONEOUS;
    }

    public Date getEndOfNextNthPeriod(Date date, int i11) {
        int i12;
        setTime(date);
        roundDownTime(this, this.datePattern);
        switch (AnonymousClass1.$SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[this.periodicityType.ordinal()]) {
            case 1:
                i12 = 11;
                break;
            case 2:
                i12 = 5;
                break;
            case 3:
                set(7, getFirstDayOfWeek());
                i12 = 3;
                break;
            case 4:
                i12 = 14;
                break;
            case 5:
                i12 = 13;
                break;
            case 6:
                i12 = 12;
                break;
            case 7:
            default:
                throw new IllegalStateException("Unknown periodicity type.");
            case 8:
                i12 = 2;
                break;
        }
        add(i12, i11);
        return getTime();
    }

    public Date getNextTriggeringDate(Date date) {
        return getEndOfNextNthPeriod(date, 1);
    }

    public PeriodicityType getPeriodicityType() {
        return this.periodicityType;
    }

    public boolean isCollisionFree() {
        int i11 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[this.periodicityType.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return (collision(CoreConstants.MILLIS_IN_ONE_WEEK) || collision(2678400000L) || collision(31536000000L)) ? false : true;
            } else if (i11 != 3) {
                return true;
            } else {
                return (collision(2937600000L) || collision(31622400000L)) ? false : true;
            }
        }
        return !collision(43200000L);
    }

    public Date normalizeDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        roundDownTime(calendar, this.datePattern);
        return calendar.getTime();
    }

    public void printPeriodicity(ContextAwareBase contextAwareBase) {
        String str;
        switch (AnonymousClass1.$SwitchMap$ch$qos$logback$core$rolling$helper$PeriodicityType[this.periodicityType.ordinal()]) {
            case 1:
                str = "Roll-over at the top of every hour.";
                break;
            case 2:
                str = "Roll-over at midnight.";
                break;
            case 3:
                str = "Rollover at the start of week.";
                break;
            case 4:
                str = "Roll-over every millisecond.";
                break;
            case 5:
                str = "Roll-over every second.";
                break;
            case 6:
                str = "Roll-over every minute.";
                break;
            case 7:
                str = "Roll-over at midday and midnight.";
                break;
            case 8:
                str = "Rollover at start of every month.";
                break;
            default:
                str = "Unknown periodicity.";
                break;
        }
        contextAwareBase.addInfo(str);
    }

    @Override // java.util.GregorianCalendar, j$.retarget.C$r8$retargetLibraryMember$virtualDispatch$GregorianCalendar$toZonedDateTime$dispatchInterface
    public /* synthetic */ ZonedDateTime toZonedDateTime() {
        return DesugarGregorianCalendar.toZonedDateTime(this);
    }
}