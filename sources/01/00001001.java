package cd;

import ch.qos.logback.core.net.SyslogConstants;
import com.plaid.internal.d;
import java.util.HashMap;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.http2.Settings;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes.dex */
public class b extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f9061e;

    /* renamed from: f  reason: collision with root package name */
    protected static final transient HashMap<String, Integer> f9062f;

    /* renamed from: g  reason: collision with root package name */
    protected static final transient HashMap<Integer, String> f9063g;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f9061e = hashMap;
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        f9062f = hashMap2;
        HashMap<Integer, String> hashMap3 = new HashMap<>();
        f9063g = hashMap3;
        hashMap2.put("IART", 7);
        hashMap2.put("INAM", 8);
        hashMap2.put("IPRD", 9);
        hashMap2.put("ITRK", 10);
        hashMap2.put("ICRD", 11);
        hashMap2.put("IGNR", 12);
        hashMap2.put("ICMT", 13);
        hashMap2.put("ICOP", 14);
        hashMap2.put("ISFT", 15);
        hashMap.put(1, "Format");
        hashMap.put(2, "Channels");
        hashMap.put(3, "Samples Per Second");
        hashMap.put(4, "Bytes Per Second");
        hashMap.put(5, "Block Alignment");
        hashMap.put(6, "Bits Per Sample");
        hashMap.put(7, "Artist");
        hashMap.put(8, "Title");
        hashMap.put(9, "Product");
        hashMap.put(10, "Track Number");
        hashMap.put(11, "Date Created");
        hashMap.put(12, "Genre");
        hashMap.put(13, "Comments");
        hashMap.put(14, "Copyright");
        hashMap.put(15, "Software");
        hashMap.put(16, "Duration");
        hashMap3.put(1, "Microsoft PCM");
        hashMap3.put(2, "Microsoft ADPCM");
        hashMap3.put(3, "Microsoft IEEE float");
        hashMap3.put(4, "Compaq VSELP");
        hashMap3.put(5, "IBM CVSD");
        hashMap3.put(6, "Microsoft a-Law");
        hashMap3.put(7, "Microsoft u-Law");
        hashMap3.put(8, "Microsoft DTS");
        hashMap3.put(9, "DRM");
        hashMap3.put(10, "WMA 9 Speech");
        hashMap3.put(11, "Microsoft Windows Media RT Voice");
        hashMap3.put(16, "OKI-ADPCM");
        hashMap3.put(17, "Intel IMA/DVI-ADPCM");
        hashMap3.put(18, "Videologic Mediaspace ADPCM");
        hashMap3.put(19, "Sierra ADPCM");
        hashMap3.put(20, "Antex G.723 ADPCM");
        hashMap3.put(21, "DSP Solutions DIGISTD");
        hashMap3.put(22, "DSP Solutions DIGIFIX");
        hashMap3.put(23, "Dialoic OKI ADPCM");
        hashMap3.put(24, "Media Vision ADPCM");
        hashMap3.put(25, "HP CU");
        hashMap3.put(26, "HP Dynamic Voice");
        hashMap3.put(32, "Yamaha ADPCM");
        hashMap3.put(33, "SONARC Speech Compression");
        hashMap3.put(34, "DSP Group True Speech");
        hashMap3.put(35, "Echo Speech Corp.");
        hashMap3.put(36, "Virtual Music Audiofile AF36");
        hashMap3.put(37, "Audio Processing Tech.");
        hashMap3.put(38, "Virtual Music Audiofile AF10");
        hashMap3.put(39, "Aculab Prosody 1612");
        hashMap3.put(40, "Merging Tech. LRC");
        hashMap3.put(48, "Dolby AC2");
        hashMap3.put(49, "Microsoft GSM610");
        hashMap3.put(50, "MSN Audio");
        hashMap3.put(51, "Antex ADPCME");
        hashMap3.put(52, "Control Resources VQLPC");
        hashMap3.put(53, "DSP Solutions DIGIREAL");
        hashMap3.put(54, "DSP Solutions DIGIADPCM");
        hashMap3.put(55, "Control Resources CR10");
        hashMap3.put(56, "Natural MicroSystems VBX ADPCM");
        hashMap3.put(57, "Crystal Semiconductor IMA ADPCM");
        hashMap3.put(58, "Echo Speech ECHOSC3");
        hashMap3.put(59, "Rockwell ADPCM");
        hashMap3.put(60, "Rockwell DIGITALK");
        hashMap3.put(61, "Xebec Multimedia");
        hashMap3.put(64, "Antex G.721 ADPCM");
        hashMap3.put(65, "Antex G.728 CELP");
        hashMap3.put(66, "Microsoft MSG723");
        hashMap3.put(67, "IBM AVC ADPCM");
        hashMap3.put(69, "ITU-T G.726");
        hashMap3.put(80, "Microsoft MPEG");
        hashMap3.put(81, "RT23 or PAC");
        hashMap3.put(82, "InSoft RT24");
        hashMap3.put(83, "InSoft PAC");
        hashMap3.put(85, "MP3");
        hashMap3.put(89, "Cirrus");
        hashMap3.put(96, "Cirrus Logic");
        hashMap3.put(97, "ESS Tech. PCM");
        hashMap3.put(98, "Voxware Inc.");
        hashMap3.put(99, "Canopus ATRAC");
        hashMap3.put(100, "APICOM G.726 ADPCM");
        hashMap3.put(101, "APICOM G.722 ADPCM");
        hashMap3.put(102, "Microsoft DSAT");
        hashMap3.put(103, "Micorsoft DSAT DISPLAY");
        hashMap3.put(105, "Voxware Byte Aligned");
        hashMap3.put(112, "Voxware AC8");
        hashMap3.put(113, "Voxware AC10");
        hashMap3.put(114, "Voxware AC16");
        hashMap3.put(115, "Voxware AC20");
        hashMap3.put(116, "Voxware MetaVoice");
        hashMap3.put(117, "Voxware MetaSound");
        hashMap3.put(118, "Voxware RT29HW");
        hashMap3.put(119, "Voxware VR12");
        hashMap3.put(120, "Voxware VR18");
        hashMap3.put(121, "Voxware TQ40");
        hashMap3.put(122, "Voxware SC3");
        hashMap3.put(123, "Voxware SC3");
        hashMap3.put(128, "Soundsoft");
        hashMap3.put(Integer.valueOf((int) d.SDK_ASSET_ILLUSTRATION_FORM_VALUE), "Voxware TQ60");
        hashMap3.put(Integer.valueOf((int) d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE), "Microsoft MSRT24");
        hashMap3.put(Integer.valueOf((int) d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE), "AT&T G.729A");
        hashMap3.put(132, "Motion Pixels MVI MV12");
        hashMap3.put(133, "DataFusion G.726");
        hashMap3.put(134, "DataFusion GSM610");
        hashMap3.put(136, "Iterated Systems Audio");
        hashMap3.put(137, "Onlive");
        hashMap3.put(138, "Multitude, Inc. FT SX20");
        hashMap3.put(139, "Infocom ITS A/S G.721 ADPCM");
        hashMap3.put(140, "Convedia G729");
        hashMap3.put(141, "Not specified congruency, Inc.");
        hashMap3.put(145, "Siemens SBC24");
        hashMap3.put(146, "Sonic Foundry Dolby AC3 APDIF");
        hashMap3.put(147, "MediaSonic G.723");
        hashMap3.put(148, "Aculab Prosody 8kbps");
        hashMap3.put(151, "ZyXEL ADPCM");
        hashMap3.put(152, "Philips LPCBB");
        hashMap3.put(153, "Studer Professional Audio Packed");
        hashMap3.put(160, "Malden PhonyTalk");
        hashMap3.put(Integer.valueOf((int) CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384), "Racal Recorder GSM");
        hashMap3.put(Integer.valueOf((int) CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256), "Racal Recorder G720.a");
        hashMap3.put(Integer.valueOf((int) CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384), "Racal G723.1");
        hashMap3.put(Integer.valueOf((int) CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256), "Racal Tetra ACELP");
        hashMap3.put(176, "NEC AAC NEC Corporation");
        hashMap3.put(255, "AAC");
        hashMap3.put(256, "Rhetorex ADPCM");
        hashMap3.put(257, "IBM u-Law");
        hashMap3.put(258, "IBM a-Law");
        hashMap3.put(259, "IBM ADPCM");
        hashMap3.put(273, "Vivo G.723");
        hashMap3.put(274, "Vivo Siren");
        hashMap3.put(288, "Philips Speech Processing CELP");
        hashMap3.put(289, "Philips Speech Processing GRUNDIG");
        hashMap3.put(291, "Digital G.723");
        hashMap3.put(293, "Sanyo LD ADPCM");
        hashMap3.put(304, "Sipro Lab ACEPLNET");
        hashMap3.put(305, "Sipro Lab ACELP4800");
        hashMap3.put(306, "Sipro Lab ACELP8V3");
        hashMap3.put(Integer.valueOf((int) StatusLine.HTTP_TEMP_REDIRECT), "Sipro Lab G.729");
        hashMap3.put(Integer.valueOf((int) StatusLine.HTTP_PERM_REDIRECT), "Sipro Lab G.729A");
        hashMap3.put(309, "Sipro Lab Kelvin");
        hashMap3.put(310, "VoiceAge AMR");
        hashMap3.put(320, "Dictaphone G.726 ADPCM");
        hashMap3.put(336, "Qualcomm PureVoice");
        hashMap3.put(337, "Qualcomm HalfRate");
        hashMap3.put(341, "Ring Zero Systems TUBGSM");
        hashMap3.put(352, "Microsoft Audio1");
        hashMap3.put(353, "Windows Media Audio V2 V7 V8 V9 / DivX audio (WMA) / Alex AC3 Audio");
        hashMap3.put(354, "Windows Media Audio Professional V9");
        hashMap3.put(355, "Windows Media Audio Lossless V9");
        hashMap3.put(356, "WMA Pro over S/PDIF");
        hashMap3.put(368, "UNISYS NAP ADPCM");
        hashMap3.put(369, "UNISYS NAP ULAW");
        hashMap3.put(370, "UNISYS NAP ALAW");
        hashMap3.put(371, "UNISYS NAP 16K");
        hashMap3.put(372, "MM SYCOM ACM SYC008 SyCom Technologies");
        hashMap3.put(373, "MM SYCOM ACM SYC701 G726L SyCom Technologies");
        hashMap3.put(374, "MM SYCOM ACM SYC701 CELP54 SyCom Technologies");
        hashMap3.put(375, "MM SYCOM ACM SYC701 CELP68 SyCom Technologies");
        hashMap3.put(376, "Knowledge Adventure ADPCM");
        hashMap3.put(384, "Fraunhofer IIS MPEG2AAC");
        hashMap3.put(400, "Digital Theater Systems DTS DS");
        hashMap3.put(512, "Creative Labs ADPCM");
        hashMap3.put(Integer.valueOf((int) SyslogConstants.SYSLOG_PORT), "Creative Labs FASTSPEECH8");
        hashMap3.put(515, "Creative Labs FASTSPEECH10");
        hashMap3.put(528, "UHER ADPCM");
        hashMap3.put(533, "Ulead DV ACM");
        hashMap3.put(534, "Ulead DV ACM");
        hashMap3.put(544, "Quarterdeck Corp.");
        hashMap3.put(560, "I-Link VC");
        hashMap3.put(576, "Aureal Semiconductor Raw Sport");
        hashMap3.put(577, "ESST AC3");
        hashMap3.put(592, "Interactive Products HSX");
        hashMap3.put(593, "Interactive Products RPELP");
        hashMap3.put(608, "Consistent CS2");
        hashMap3.put(624, "Sony SCX");
        hashMap3.put(625, "Sony SCY");
        hashMap3.put(626, "Sony ATRAC3");
        hashMap3.put(627, "Sony SPC");
        hashMap3.put(640, "TELUM Telum Inc.");
        hashMap3.put(641, "TELUMIA Telum Inc.");
        hashMap3.put(645, "Norcom Voice Systems ADPCM");
        hashMap3.put(768, "Fujitsu FM TOWNS SND");
        hashMap3.put(769, "Fujitsu (not specified)");
        hashMap3.put(770, "Fujitsu (not specified)");
        hashMap3.put(771, "Fujitsu (not specified)");
        hashMap3.put(772, "Fujitsu (not specified)");
        hashMap3.put(773, "Fujitsu (not specified)");
        hashMap3.put(774, "Fujitsu (not specified)");
        hashMap3.put(775, "Fujitsu (not specified)");
        hashMap3.put(776, "Fujitsu (not specified)");
        hashMap3.put(848, "Micronas Semiconductors, Inc. Development");
        hashMap3.put(849, "Micronas Semiconductors, Inc. CELP833");
        hashMap3.put(1024, "Brooktree Digital");
        hashMap3.put(1025, "Intel Music Coder (IMC)");
        hashMap3.put(1026, "Ligos Indeo Audio");
        hashMap3.put(1104, "QDesign Music");
        hashMap3.put(1280, "On2 VP7 On2 Technologies");
        hashMap3.put(1281, "On2 VP6 On2 Technologies");
        hashMap3.put(1664, "AT&T VME VMPCM");
        hashMap3.put(1665, "AT&T TCP");
        hashMap3.put(1792, "YMPEG Alpha (dummy for MPEG-2 compressor)");
        hashMap3.put(2222, "ClearJump LiteWave (lossless)");
        hashMap3.put(4096, "Olivetti GSM");
        hashMap3.put(4097, "Olivetti ADPCM");
        hashMap3.put(4098, "Olivetti CELP");
        hashMap3.put(4099, "Olivetti SBC");
        hashMap3.put(4100, "Olivetti OPR");
        hashMap3.put(4352, "Lernout & Hauspie");
        hashMap3.put(4353, "Lernout & Hauspie CELP codec");
        hashMap3.put(4354, "Lernout & Hauspie SBC codec");
        hashMap3.put(4355, "Lernout & Hauspie SBC codec");
        hashMap3.put(4356, "Lernout & Hauspie SBC codec");
        hashMap3.put(5120, "Norris Comm. Inc.");
        hashMap3.put(5121, "ISIAudio");
        hashMap3.put(5376, "AT&T Soundspace Music Compression");
        hashMap3.put(6172, "VoxWare RT24 speech codec");
        hashMap3.put(6174, "Lucent elemedia AX24000P Music codec");
        hashMap3.put(6513, "Sonic Foundry LOSSLESS");
        hashMap3.put(6521, "Innings Telecom Inc. ADPCM");
        hashMap3.put(7175, "Lucent SX8300P speech codec");
        hashMap3.put(7180, "Lucent SX5363S G.723 compliant codec");
        hashMap3.put(7939, "CUseeMe DigiTalk (ex-Rocwell)");
        hashMap3.put(8132, "NCT Soft ALF2CD ACM");
        hashMap3.put(Integer.valueOf((int) PKIFailureInfo.certRevoked), "FAST Multimedia DVM");
        hashMap3.put(8193, "Dolby DTS (Digital Theater System)");
        hashMap3.put(8194, "RealAudio 1 / 2 14.4");
        hashMap3.put(8195, "RealAudio 1 / 2 28.8");
        hashMap3.put(8196, "RealAudio G2 / 8 Cook (low bitrate)");
        hashMap3.put(8197, "RealAudio 3 / 4 / 5 Music (DNET)");
        hashMap3.put(8198, "RealAudio 10 AAC (RAAC)");
        hashMap3.put(8199, "RealAudio 10 AAC+ (RACP)");
        hashMap3.put(9472, "Reserved range to 0x2600 Microsoft");
        hashMap3.put(13075, "makeAVIS (ffvfw fake AVI sound from AviSynth scripts)");
        hashMap3.put(16707, "Divio MPEG-4 AAC audio");
        hashMap3.put(16897, "Nokia adaptive multirate");
        hashMap3.put(16963, "Divio G726 Divio, Inc.");
        hashMap3.put(17228, "LEAD Speech");
        hashMap3.put(22092, "LEAD Vorbis");
        hashMap3.put(22358, "WavPack Audio");
        hashMap3.put(26447, "Ogg Vorbis (mode 1)");
        hashMap3.put(26448, "Ogg Vorbis (mode 2)");
        hashMap3.put(26449, "Ogg Vorbis (mode 3)");
        hashMap3.put(26479, "Ogg Vorbis (mode 1+)");
        hashMap3.put(26480, "Ogg Vorbis (mode 2+)");
        hashMap3.put(26481, "Ogg Vorbis (mode 3+)");
        hashMap3.put(28672, "3COM NBX 3Com Corporation");
        hashMap3.put(28781, "FAAD AAC");
        hashMap3.put(31265, "GSM-AMR (CBR, no SID)");
        hashMap3.put(31266, "GSM-AMR (VBR, including SID)");
        hashMap3.put(41216, "Comverse Infosys Ltd. G723 1");
        hashMap3.put(41217, "Comverse Infosys Ltd. AVQSBC");
        hashMap3.put(41218, "Comverse Infosys Ltd. OLDSBC");
        hashMap3.put(41219, "Symbol Technologies G729A");
        hashMap3.put(41220, "VoiceAge AMR WB VoiceAge Corporation");
        hashMap3.put(41221, "Ingenient Technologies Inc. G726");
        hashMap3.put(41222, "ISO/MPEG-4 advanced audio Coding");
        hashMap3.put(41223, "Encore Software Ltd G726");
        hashMap3.put(41225, "Speex ACM Codec xiph.org");
        hashMap3.put(57260, "DebugMode SonicFoundry Vegas FrameServer ACM Codec");
        hashMap3.put(59144, "Unknown -");
        hashMap3.put(61868, "Free Lossless Audio Codec FLAC");
        hashMap3.put(65534, "Extensible");
        hashMap3.put(Integer.valueOf((int) Settings.DEFAULT_INITIAL_WINDOW_SIZE), "Development");
    }

    public b() {
        E(new a(this));
    }

    @Override // cc.b
    public String n() {
        return "WAV";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f9061e;
    }
}