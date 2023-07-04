package nc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class b extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f40776e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f40776e = hashMap;
        hashMap.put(256, "Enveloped Record Version");
        hashMap.put(261, "Destination");
        hashMap.put(276, "File Format");
        hashMap.put(278, "File Version");
        hashMap.put(286, "Service Identifier");
        hashMap.put(296, "Envelope Number");
        hashMap.put(306, "Product Identifier");
        hashMap.put(316, "Envelope Priority");
        hashMap.put(326, "Date Sent");
        hashMap.put(336, "Time Sent");
        hashMap.put(346, "Coded Character Set");
        hashMap.put(356, "Unique Object Name");
        hashMap.put(376, "ARM Identifier");
        hashMap.put(378, "ARM Version");
        hashMap.put(512, "Application Record Version");
        hashMap.put(515, "Object Type Reference");
        hashMap.put(516, "Object Attribute Reference");
        hashMap.put(517, "Object Name");
        hashMap.put(519, "Edit Status");
        hashMap.put(520, "Editorial Update");
        hashMap.put(522, "Urgency");
        hashMap.put(524, "Subject Reference");
        hashMap.put(527, "Category");
        hashMap.put(532, "Supplemental Category(s)");
        hashMap.put(534, "Fixture Identifier");
        hashMap.put(537, "Keywords");
        hashMap.put(538, "Content Location Code");
        hashMap.put(539, "Content Location Name");
        hashMap.put(542, "Release Date");
        hashMap.put(547, "Release Time");
        hashMap.put(549, "Expiration Date");
        hashMap.put(550, "Expiration Time");
        hashMap.put(552, "Special Instructions");
        hashMap.put(554, "Action Advised");
        hashMap.put(557, "Reference Service");
        hashMap.put(559, "Reference Date");
        hashMap.put(562, "Reference Number");
        hashMap.put(567, "Date Created");
        hashMap.put(572, "Time Created");
        hashMap.put(574, "Digital Date Created");
        hashMap.put(575, "Digital Time Created");
        hashMap.put(577, "Originating Program");
        hashMap.put(582, "Program Version");
        hashMap.put(587, "Object Cycle");
        hashMap.put(592, "By-line");
        hashMap.put(597, "By-line Title");
        hashMap.put(602, "City");
        hashMap.put(604, "Sub-location");
        hashMap.put(607, "Province/State");
        hashMap.put(612, "Country/Primary Location Code");
        hashMap.put(613, "Country/Primary Location Name");
        hashMap.put(615, "Original Transmission Reference");
        hashMap.put(617, "Headline");
        hashMap.put(622, "Credit");
        hashMap.put(627, "Source");
        hashMap.put(628, "Copyright Notice");
        hashMap.put(630, "Contact");
        hashMap.put(632, "Caption/Abstract");
        hashMap.put(633, "Local Caption");
        hashMap.put(634, "Caption Writer/Editor");
        hashMap.put(637, "Rasterized Caption");
        hashMap.put(642, "Image Type");
        hashMap.put(643, "Image Orientation");
        hashMap.put(647, "Language Identifier");
        hashMap.put(662, "Audio Type");
        hashMap.put(663, "Audio Sampling Rate");
        hashMap.put(664, "Audio Sampling Resolution");
        hashMap.put(665, "Audio Duration");
        hashMap.put(666, "Audio Outcue");
        hashMap.put(696, "Job Identifier");
        hashMap.put(697, "Master Document Identifier");
        hashMap.put(698, "Short Document Identifier");
        hashMap.put(699, "Unique Document Identifier");
        hashMap.put(700, "Owner Identifier");
        hashMap.put(712, "Object Data Preview File Format");
        hashMap.put(713, "Object Data Preview File Format Version");
        hashMap.put(714, "Object Data Preview Data");
    }

    public b() {
        E(new a(this));
    }

    @Override // cc.b
    public String n() {
        return "IPTC";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f40776e;
    }
}