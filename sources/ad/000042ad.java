package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.BetaAssetsUserSelection$BetaAssetsUserSelectionPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.BetaButtonWithAccountList$BetaButtonWithAccountListPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.BetaButtonWithMultiTable$BetaButtonWithMultiTablePane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.BetaButtonWithTabularList$BetaButtonWithTabularListPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.BetaUpload$BetaUploadPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Button$ButtonPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonList$ButtonListPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordion$ButtonWithAccordionPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCards$ButtonWithCardsPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTable$ButtonWithTablePane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithWebview$ButtonWithWebviewPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Challenge$ChallengePane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Consent$ConsentPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Credentials$CredentialsPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelection$GridSelectionPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuth$HeadlessOAuthPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Oauth$OAuthPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedList$OrderedListPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.QrCode$QRCodePane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelect$SearchAndSelectPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Sink$SinkPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Source$SourcePane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInput$UserInputPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelection$UserSelectionPane;
import com.plaid.internal.t7;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Pane$PaneOutput extends GeneratedMessageLite<Pane$PaneOutput, a> implements d {
    public static final int BETA_ASSETS_USER_SELECTION_FIELD_NUMBER = 122;
    public static final int BETA_BUTTON_WITH_ACCOUNT_LIST_FIELD_NUMBER = 124;
    public static final int BETA_BUTTON_WITH_MULTI_TABLE_FIELD_NUMBER = 121;
    public static final int BETA_BUTTON_WITH_TABULAR_LIST_FIELD_NUMBER = 123;
    public static final int BETA_SWITCH_SEARCH_AND_SELECT_FIELD_NUMBER = 119;
    public static final int BETA_UPLOAD_FIELD_NUMBER = 118;
    public static final int BUTTON_FIELD_NUMBER = 105;
    public static final int BUTTON_LIST_FIELD_NUMBER = 106;
    public static final int BUTTON_WITH_ACCORDION_FIELD_NUMBER = 107;
    public static final int BUTTON_WITH_CARDS_FIELD_NUMBER = 108;
    public static final int BUTTON_WITH_TABLE_FIELD_NUMBER = 109;
    public static final int BUTTON_WITH_WEBVIEW_FIELD_NUMBER = 110;
    public static final int CHALLENGE_FIELD_NUMBER = 117;
    public static final int CONSENT_FIELD_NUMBER = 104;
    public static final int CREDENTIALS_FIELD_NUMBER = 103;
    private static final Pane$PaneOutput DEFAULT_INSTANCE;
    public static final int GRID_SELECTION_FIELD_NUMBER = 114;
    public static final int HEADLESS_O_AUTH_FIELD_NUMBER = 120;
    public static final int OAUTH_FIELD_NUMBER = 115;
    public static final int ORDERED_LIST_FIELD_NUMBER = 116;
    public static final int PANE_NODE_ID_FIELD_NUMBER = 2;
    public static final int PANE_RENDERING_ID_FIELD_NUMBER = 1;
    private static volatile Parser<Pane$PaneOutput> PARSER = null;
    public static final int QR_CODE_FIELD_NUMBER = 125;
    public static final int SEARCH_AND_SELECT_FIELD_NUMBER = 111;
    public static final int SINK_FIELD_NUMBER = 102;
    public static final int SOURCE_FIELD_NUMBER = 101;
    public static final int USER_INPUT_FIELD_NUMBER = 112;
    public static final int USER_SELECTION_FIELD_NUMBER = 113;
    private Object output_;
    private int outputCase_ = 0;
    private String paneRenderingId_ = "";
    private String paneNodeId_ = "";

    /* loaded from: classes2.dex */
    public enum b {
        SOURCE(101),
        SINK(102),
        CREDENTIALS(103),
        CONSENT(104),
        BUTTON(105),
        BUTTON_LIST(106),
        BUTTON_WITH_ACCORDION(107),
        BUTTON_WITH_CARDS(108),
        BUTTON_WITH_TABLE(109),
        BUTTON_WITH_WEBVIEW(110),
        SEARCH_AND_SELECT(111),
        USER_INPUT(112),
        USER_SELECTION(113),
        GRID_SELECTION(114),
        OAUTH(115),
        ORDERED_LIST(116),
        CHALLENGE(117),
        BETA_UPLOAD(118),
        BETA_SWITCH_SEARCH_AND_SELECT(119),
        HEADLESS_O_AUTH(120),
        BETA_BUTTON_WITH_MULTI_TABLE(121),
        BETA_ASSETS_USER_SELECTION(122),
        BETA_BUTTON_WITH_TABULAR_LIST(123),
        BETA_BUTTON_WITH_ACCOUNT_LIST(124),
        QR_CODE(125),
        OUTPUT_NOT_SET(0);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f18386a;

        b(int i11) {
            this.f18386a = i11;
        }

        public static b forNumber(int i11) {
            if (i11 != 0) {
                switch (i11) {
                    case 101:
                        return SOURCE;
                    case 102:
                        return SINK;
                    case 103:
                        return CREDENTIALS;
                    case 104:
                        return CONSENT;
                    case 105:
                        return BUTTON;
                    case 106:
                        return BUTTON_LIST;
                    case 107:
                        return BUTTON_WITH_ACCORDION;
                    case 108:
                        return BUTTON_WITH_CARDS;
                    case 109:
                        return BUTTON_WITH_TABLE;
                    case 110:
                        return BUTTON_WITH_WEBVIEW;
                    case 111:
                        return SEARCH_AND_SELECT;
                    case 112:
                        return USER_INPUT;
                    case 113:
                        return USER_SELECTION;
                    case 114:
                        return GRID_SELECTION;
                    case 115:
                        return OAUTH;
                    case 116:
                        return ORDERED_LIST;
                    case 117:
                        return CHALLENGE;
                    case 118:
                        return BETA_UPLOAD;
                    case 119:
                        return BETA_SWITCH_SEARCH_AND_SELECT;
                    case 120:
                        return HEADLESS_O_AUTH;
                    case 121:
                        return BETA_BUTTON_WITH_MULTI_TABLE;
                    case 122:
                        return BETA_ASSETS_USER_SELECTION;
                    case 123:
                        return BETA_BUTTON_WITH_TABULAR_LIST;
                    case 124:
                        return BETA_BUTTON_WITH_ACCOUNT_LIST;
                    case 125:
                        return QR_CODE;
                    default:
                        return null;
                }
            }
            return OUTPUT_NOT_SET;
        }

        public int getNumber() {
            return this.f18386a;
        }

        @Deprecated
        public static b valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        Pane$PaneOutput pane$PaneOutput = new Pane$PaneOutput();
        DEFAULT_INSTANCE = pane$PaneOutput;
        GeneratedMessageLite.registerDefaultInstance(Pane$PaneOutput.class, pane$PaneOutput);
    }

    private Pane$PaneOutput() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBetaAssetsUserSelection() {
        if (this.outputCase_ == 122) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBetaButtonWithAccountList() {
        if (this.outputCase_ == 124) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBetaButtonWithMultiTable() {
        if (this.outputCase_ == 121) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBetaButtonWithTabularList() {
        if (this.outputCase_ == 123) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBetaSwitchSearchAndSelect() {
        if (this.outputCase_ == 119) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBetaUpload() {
        if (this.outputCase_ == 118) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButton() {
        if (this.outputCase_ == 105) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonList() {
        if (this.outputCase_ == 106) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonWithAccordion() {
        if (this.outputCase_ == 107) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonWithCards() {
        if (this.outputCase_ == 108) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonWithTable() {
        if (this.outputCase_ == 109) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonWithWebview() {
        if (this.outputCase_ == 110) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChallenge() {
        if (this.outputCase_ == 117) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsent() {
        if (this.outputCase_ == 104) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCredentials() {
        if (this.outputCase_ == 103) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGridSelection() {
        if (this.outputCase_ == 114) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeadlessOAuth() {
        if (this.outputCase_ == 120) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOauth() {
        if (this.outputCase_ == 115) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrderedList() {
        if (this.outputCase_ == 116) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutput() {
        this.outputCase_ = 0;
        this.output_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaneNodeId() {
        this.paneNodeId_ = getDefaultInstance().getPaneNodeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaneRenderingId() {
        this.paneRenderingId_ = getDefaultInstance().getPaneRenderingId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQrCode() {
        if (this.outputCase_ == 125) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchAndSelect() {
        if (this.outputCase_ == 111) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSink() {
        if (this.outputCase_ == 102) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        if (this.outputCase_ == 101) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserInput() {
        if (this.outputCase_ == 112) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserSelection() {
        if (this.outputCase_ == 113) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    public static Pane$PaneOutput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBetaAssetsUserSelection(BetaAssetsUserSelection$BetaAssetsUserSelectionPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ == 122 && this.output_ != BetaAssetsUserSelection$BetaAssetsUserSelectionPane.Actions.getDefaultInstance()) {
            this.output_ = BetaAssetsUserSelection$BetaAssetsUserSelectionPane.Actions.newBuilder((BetaAssetsUserSelection$BetaAssetsUserSelectionPane.Actions) this.output_).mergeFrom((BetaAssetsUserSelection$BetaAssetsUserSelectionPane.Actions.b) actions).buildPartial();
        } else {
            this.output_ = actions;
        }
        this.outputCase_ = 122;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBetaButtonWithAccountList(BetaButtonWithAccountList$BetaButtonWithAccountListPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ == 124 && this.output_ != BetaButtonWithAccountList$BetaButtonWithAccountListPane.Actions.getDefaultInstance()) {
            this.output_ = BetaButtonWithAccountList$BetaButtonWithAccountListPane.Actions.newBuilder((BetaButtonWithAccountList$BetaButtonWithAccountListPane.Actions) this.output_).mergeFrom((BetaButtonWithAccountList$BetaButtonWithAccountListPane.Actions.b) actions).buildPartial();
        } else {
            this.output_ = actions;
        }
        this.outputCase_ = 124;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBetaButtonWithMultiTable(BetaButtonWithMultiTable$BetaButtonWithMultiTablePane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ == 121 && this.output_ != BetaButtonWithMultiTable$BetaButtonWithMultiTablePane.Actions.getDefaultInstance()) {
            this.output_ = BetaButtonWithMultiTable$BetaButtonWithMultiTablePane.Actions.newBuilder((BetaButtonWithMultiTable$BetaButtonWithMultiTablePane.Actions) this.output_).mergeFrom((BetaButtonWithMultiTable$BetaButtonWithMultiTablePane.Actions.b) actions).buildPartial();
        } else {
            this.output_ = actions;
        }
        this.outputCase_ = 121;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBetaButtonWithTabularList(BetaButtonWithTabularList$BetaButtonWithTabularListPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ == 123 && this.output_ != BetaButtonWithTabularList$BetaButtonWithTabularListPane.Actions.getDefaultInstance()) {
            this.output_ = BetaButtonWithTabularList$BetaButtonWithTabularListPane.Actions.newBuilder((BetaButtonWithTabularList$BetaButtonWithTabularListPane.Actions) this.output_).mergeFrom((BetaButtonWithTabularList$BetaButtonWithTabularListPane.Actions.b) actions).buildPartial();
        } else {
            this.output_ = actions;
        }
        this.outputCase_ = 123;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBetaSwitchSearchAndSelect(BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ == 119 && this.output_ != BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane.Actions.getDefaultInstance()) {
            this.output_ = BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane.Actions.newBuilder((BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane.Actions) this.output_).mergeFrom((BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane.Actions.b) actions).buildPartial();
        } else {
            this.output_ = actions;
        }
        this.outputCase_ = 119;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBetaUpload(BetaUpload$BetaUploadPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ == 118 && this.output_ != BetaUpload$BetaUploadPane.Actions.getDefaultInstance()) {
            this.output_ = BetaUpload$BetaUploadPane.Actions.newBuilder((BetaUpload$BetaUploadPane.Actions) this.output_).mergeFrom((BetaUpload$BetaUploadPane.Actions.b) actions).buildPartial();
        } else {
            this.output_ = actions;
        }
        this.outputCase_ = 118;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeButton(Button$ButtonPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ == 105 && this.output_ != Button$ButtonPane.Actions.getDefaultInstance()) {
            this.output_ = Button$ButtonPane.Actions.newBuilder((Button$ButtonPane.Actions) this.output_).mergeFrom((Button$ButtonPane.Actions.b) actions).buildPartial();
        } else {
            this.output_ = actions;
        }
        this.outputCase_ = 105;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeButtonList(ButtonList$ButtonListPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ == 106 && this.output_ != ButtonList$ButtonListPane.Actions.getDefaultInstance()) {
            this.output_ = ButtonList$ButtonListPane.Actions.newBuilder((ButtonList$ButtonListPane.Actions) this.output_).mergeFrom((ButtonList$ButtonListPane.Actions.b) actions).buildPartial();
        } else {
            this.output_ = actions;
        }
        this.outputCase_ = 106;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeButtonWithAccordion(ButtonWithAccordion$ButtonWithAccordionPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ == 107 && this.output_ != ButtonWithAccordion$ButtonWithAccordionPane.Actions.getDefaultInstance()) {
            this.output_ = ButtonWithAccordion$ButtonWithAccordionPane.Actions.newBuilder((ButtonWithAccordion$ButtonWithAccordionPane.Actions) this.output_).mergeFrom((ButtonWithAccordion$ButtonWithAccordionPane.Actions.b) actions).buildPartial();
        } else {
            this.output_ = actions;
        }
        this.outputCase_ = 107;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeButtonWithCards(ButtonWithCards$ButtonWithCardsPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ == 108 && this.output_ != ButtonWithCards$ButtonWithCardsPane.Actions.getDefaultInstance()) {
            this.output_ = ButtonWithCards$ButtonWithCardsPane.Actions.newBuilder((ButtonWithCards$ButtonWithCardsPane.Actions) this.output_).mergeFrom((ButtonWithCards$ButtonWithCardsPane.Actions.b) actions).buildPartial();
        } else {
            this.output_ = actions;
        }
        this.outputCase_ = 108;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeButtonWithTable(ButtonWithTable$ButtonWithTablePane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ == 109 && this.output_ != ButtonWithTable$ButtonWithTablePane.Actions.getDefaultInstance()) {
            this.output_ = ButtonWithTable$ButtonWithTablePane.Actions.newBuilder((ButtonWithTable$ButtonWithTablePane.Actions) this.output_).mergeFrom((ButtonWithTable$ButtonWithTablePane.Actions.b) actions).buildPartial();
        } else {
            this.output_ = actions;
        }
        this.outputCase_ = 109;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeButtonWithWebview(ButtonWithWebview$ButtonWithWebviewPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ == 110 && this.output_ != ButtonWithWebview$ButtonWithWebviewPane.Actions.getDefaultInstance()) {
            this.output_ = ButtonWithWebview$ButtonWithWebviewPane.Actions.newBuilder((ButtonWithWebview$ButtonWithWebviewPane.Actions) this.output_).mergeFrom((ButtonWithWebview$ButtonWithWebviewPane.Actions.b) actions).buildPartial();
        } else {
            this.output_ = actions;
        }
        this.outputCase_ = 110;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChallenge(Challenge$ChallengePane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ == 117 && this.output_ != Challenge$ChallengePane.Actions.getDefaultInstance()) {
            this.output_ = Challenge$ChallengePane.Actions.newBuilder((Challenge$ChallengePane.Actions) this.output_).mergeFrom((Challenge$ChallengePane.Actions.b) actions).buildPartial();
        } else {
            this.output_ = actions;
        }
        this.outputCase_ = 117;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConsent(Consent$ConsentPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ == 104 && this.output_ != Consent$ConsentPane.Actions.getDefaultInstance()) {
            this.output_ = Consent$ConsentPane.Actions.newBuilder((Consent$ConsentPane.Actions) this.output_).mergeFrom((Consent$ConsentPane.Actions.b) actions).buildPartial();
        } else {
            this.output_ = actions;
        }
        this.outputCase_ = 104;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCredentials(Credentials$CredentialsPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ == 103 && this.output_ != Credentials$CredentialsPane.Actions.getDefaultInstance()) {
            this.output_ = Credentials$CredentialsPane.Actions.newBuilder((Credentials$CredentialsPane.Actions) this.output_).mergeFrom((Credentials$CredentialsPane.Actions.b) actions).buildPartial();
        } else {
            this.output_ = actions;
        }
        this.outputCase_ = 103;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGridSelection(GridSelection$GridSelectionPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ == 114 && this.output_ != GridSelection$GridSelectionPane.Actions.getDefaultInstance()) {
            this.output_ = GridSelection$GridSelectionPane.Actions.newBuilder((GridSelection$GridSelectionPane.Actions) this.output_).mergeFrom((GridSelection$GridSelectionPane.Actions.b) actions).buildPartial();
        } else {
            this.output_ = actions;
        }
        this.outputCase_ = 114;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHeadlessOAuth(HeadlessOAuth$HeadlessOAuthPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ == 120 && this.output_ != HeadlessOAuth$HeadlessOAuthPane.Actions.getDefaultInstance()) {
            this.output_ = HeadlessOAuth$HeadlessOAuthPane.Actions.newBuilder((HeadlessOAuth$HeadlessOAuthPane.Actions) this.output_).mergeFrom((HeadlessOAuth$HeadlessOAuthPane.Actions.b) actions).buildPartial();
        } else {
            this.output_ = actions;
        }
        this.outputCase_ = 120;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOauth(Oauth$OAuthPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ == 115 && this.output_ != Oauth$OAuthPane.Actions.getDefaultInstance()) {
            this.output_ = Oauth$OAuthPane.Actions.newBuilder((Oauth$OAuthPane.Actions) this.output_).mergeFrom((Oauth$OAuthPane.Actions.b) actions).buildPartial();
        } else {
            this.output_ = actions;
        }
        this.outputCase_ = 115;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOrderedList(OrderedList$OrderedListPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ == 116 && this.output_ != OrderedList$OrderedListPane.Actions.getDefaultInstance()) {
            this.output_ = OrderedList$OrderedListPane.Actions.newBuilder((OrderedList$OrderedListPane.Actions) this.output_).mergeFrom((OrderedList$OrderedListPane.Actions.b) actions).buildPartial();
        } else {
            this.output_ = actions;
        }
        this.outputCase_ = 116;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQrCode(QrCode$QRCodePane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ == 125 && this.output_ != QrCode$QRCodePane.Actions.getDefaultInstance()) {
            this.output_ = QrCode$QRCodePane.Actions.newBuilder((QrCode$QRCodePane.Actions) this.output_).mergeFrom((QrCode$QRCodePane.Actions.b) actions).buildPartial();
        } else {
            this.output_ = actions;
        }
        this.outputCase_ = 125;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSearchAndSelect(SearchAndSelect$SearchAndSelectPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ == 111 && this.output_ != SearchAndSelect$SearchAndSelectPane.Actions.getDefaultInstance()) {
            this.output_ = SearchAndSelect$SearchAndSelectPane.Actions.newBuilder((SearchAndSelect$SearchAndSelectPane.Actions) this.output_).mergeFrom((SearchAndSelect$SearchAndSelectPane.Actions.b) actions).buildPartial();
        } else {
            this.output_ = actions;
        }
        this.outputCase_ = 111;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSink(Sink$SinkPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ == 102 && this.output_ != Sink$SinkPane.Actions.getDefaultInstance()) {
            this.output_ = Sink$SinkPane.Actions.newBuilder((Sink$SinkPane.Actions) this.output_).mergeFrom((Sink$SinkPane.Actions.a) actions).buildPartial();
        } else {
            this.output_ = actions;
        }
        this.outputCase_ = 102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSource(Source$SourcePane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ == 101 && this.output_ != Source$SourcePane.Actions.getDefaultInstance()) {
            this.output_ = Source$SourcePane.Actions.newBuilder((Source$SourcePane.Actions) this.output_).mergeFrom((Source$SourcePane.Actions.b) actions).buildPartial();
        } else {
            this.output_ = actions;
        }
        this.outputCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserInput(UserInput$UserInputPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ == 112 && this.output_ != UserInput$UserInputPane.Actions.getDefaultInstance()) {
            this.output_ = UserInput$UserInputPane.Actions.newBuilder((UserInput$UserInputPane.Actions) this.output_).mergeFrom((UserInput$UserInputPane.Actions.b) actions).buildPartial();
        } else {
            this.output_ = actions;
        }
        this.outputCase_ = 112;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserSelection(UserSelection$UserSelectionPane.Actions actions) {
        actions.getClass();
        if (this.outputCase_ == 113 && this.output_ != UserSelection$UserSelectionPane.Actions.getDefaultInstance()) {
            this.output_ = UserSelection$UserSelectionPane.Actions.newBuilder((UserSelection$UserSelectionPane.Actions) this.output_).mergeFrom((UserSelection$UserSelectionPane.Actions.b) actions).buildPartial();
        } else {
            this.output_ = actions;
        }
        this.outputCase_ = 113;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Pane$PaneOutput parseDelimitedFrom(InputStream inputStream) {
        return (Pane$PaneOutput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pane$PaneOutput parseFrom(ByteBuffer byteBuffer) {
        return (Pane$PaneOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Pane$PaneOutput> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBetaAssetsUserSelection(BetaAssetsUserSelection$BetaAssetsUserSelectionPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 122;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBetaButtonWithAccountList(BetaButtonWithAccountList$BetaButtonWithAccountListPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 124;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBetaButtonWithMultiTable(BetaButtonWithMultiTable$BetaButtonWithMultiTablePane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 121;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBetaButtonWithTabularList(BetaButtonWithTabularList$BetaButtonWithTabularListPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 123;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBetaSwitchSearchAndSelect(BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 119;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBetaUpload(BetaUpload$BetaUploadPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 118;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButton(Button$ButtonPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 105;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonList(ButtonList$ButtonListPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 106;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonWithAccordion(ButtonWithAccordion$ButtonWithAccordionPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 107;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonWithCards(ButtonWithCards$ButtonWithCardsPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 108;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonWithTable(ButtonWithTable$ButtonWithTablePane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 109;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonWithWebview(ButtonWithWebview$ButtonWithWebviewPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 110;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChallenge(Challenge$ChallengePane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 117;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsent(Consent$ConsentPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 104;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCredentials(Credentials$CredentialsPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 103;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGridSelection(GridSelection$GridSelectionPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 114;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeadlessOAuth(HeadlessOAuth$HeadlessOAuthPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 120;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOauth(Oauth$OAuthPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 115;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrderedList(OrderedList$OrderedListPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 116;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaneNodeId(String str) {
        str.getClass();
        this.paneNodeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaneNodeIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.paneNodeId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaneRenderingId(String str) {
        str.getClass();
        this.paneRenderingId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaneRenderingIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.paneRenderingId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQrCode(QrCode$QRCodePane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 125;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchAndSelect(SearchAndSelect$SearchAndSelectPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 111;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSink(Sink$SinkPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(Source$SourcePane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserInput(UserInput$UserInputPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 112;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserSelection(UserSelection$UserSelectionPane.Actions actions) {
        actions.getClass();
        this.output_ = actions;
        this.outputCase_ = 113;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (t7.f19513a[methodToInvoke.ordinal()]) {
            case 1:
                return new Pane$PaneOutput();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001b\u0001\u0000\u0001}\u001b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉe<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000k<\u0000l<\u0000m<\u0000n<\u0000o<\u0000p<\u0000q<\u0000r<\u0000s<\u0000t<\u0000u<\u0000v<\u0000w<\u0000x<\u0000y<\u0000z<\u0000{<\u0000|<\u0000}<\u0000", new Object[]{"output_", "outputCase_", "paneRenderingId_", "paneNodeId_", Source$SourcePane.Actions.class, Sink$SinkPane.Actions.class, Credentials$CredentialsPane.Actions.class, Consent$ConsentPane.Actions.class, Button$ButtonPane.Actions.class, ButtonList$ButtonListPane.Actions.class, ButtonWithAccordion$ButtonWithAccordionPane.Actions.class, ButtonWithCards$ButtonWithCardsPane.Actions.class, ButtonWithTable$ButtonWithTablePane.Actions.class, ButtonWithWebview$ButtonWithWebviewPane.Actions.class, SearchAndSelect$SearchAndSelectPane.Actions.class, UserInput$UserInputPane.Actions.class, UserSelection$UserSelectionPane.Actions.class, GridSelection$GridSelectionPane.Actions.class, Oauth$OAuthPane.Actions.class, OrderedList$OrderedListPane.Actions.class, Challenge$ChallengePane.Actions.class, BetaUpload$BetaUploadPane.Actions.class, BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane.Actions.class, HeadlessOAuth$HeadlessOAuthPane.Actions.class, BetaButtonWithMultiTable$BetaButtonWithMultiTablePane.Actions.class, BetaAssetsUserSelection$BetaAssetsUserSelectionPane.Actions.class, BetaButtonWithTabularList$BetaButtonWithTabularListPane.Actions.class, BetaButtonWithAccountList$BetaButtonWithAccountListPane.Actions.class, QrCode$QRCodePane.Actions.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Pane$PaneOutput> parser = PARSER;
                if (parser == null) {
                    synchronized (Pane$PaneOutput.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public BetaAssetsUserSelection$BetaAssetsUserSelectionPane.Actions getBetaAssetsUserSelection() {
        if (this.outputCase_ == 122) {
            return (BetaAssetsUserSelection$BetaAssetsUserSelectionPane.Actions) this.output_;
        }
        return BetaAssetsUserSelection$BetaAssetsUserSelectionPane.Actions.getDefaultInstance();
    }

    public BetaButtonWithAccountList$BetaButtonWithAccountListPane.Actions getBetaButtonWithAccountList() {
        if (this.outputCase_ == 124) {
            return (BetaButtonWithAccountList$BetaButtonWithAccountListPane.Actions) this.output_;
        }
        return BetaButtonWithAccountList$BetaButtonWithAccountListPane.Actions.getDefaultInstance();
    }

    public BetaButtonWithMultiTable$BetaButtonWithMultiTablePane.Actions getBetaButtonWithMultiTable() {
        if (this.outputCase_ == 121) {
            return (BetaButtonWithMultiTable$BetaButtonWithMultiTablePane.Actions) this.output_;
        }
        return BetaButtonWithMultiTable$BetaButtonWithMultiTablePane.Actions.getDefaultInstance();
    }

    public BetaButtonWithTabularList$BetaButtonWithTabularListPane.Actions getBetaButtonWithTabularList() {
        if (this.outputCase_ == 123) {
            return (BetaButtonWithTabularList$BetaButtonWithTabularListPane.Actions) this.output_;
        }
        return BetaButtonWithTabularList$BetaButtonWithTabularListPane.Actions.getDefaultInstance();
    }

    public BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane.Actions getBetaSwitchSearchAndSelect() {
        if (this.outputCase_ == 119) {
            return (BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane.Actions) this.output_;
        }
        return BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane.Actions.getDefaultInstance();
    }

    public BetaUpload$BetaUploadPane.Actions getBetaUpload() {
        if (this.outputCase_ == 118) {
            return (BetaUpload$BetaUploadPane.Actions) this.output_;
        }
        return BetaUpload$BetaUploadPane.Actions.getDefaultInstance();
    }

    public Button$ButtonPane.Actions getButton() {
        if (this.outputCase_ == 105) {
            return (Button$ButtonPane.Actions) this.output_;
        }
        return Button$ButtonPane.Actions.getDefaultInstance();
    }

    public ButtonList$ButtonListPane.Actions getButtonList() {
        if (this.outputCase_ == 106) {
            return (ButtonList$ButtonListPane.Actions) this.output_;
        }
        return ButtonList$ButtonListPane.Actions.getDefaultInstance();
    }

    public ButtonWithAccordion$ButtonWithAccordionPane.Actions getButtonWithAccordion() {
        if (this.outputCase_ == 107) {
            return (ButtonWithAccordion$ButtonWithAccordionPane.Actions) this.output_;
        }
        return ButtonWithAccordion$ButtonWithAccordionPane.Actions.getDefaultInstance();
    }

    public ButtonWithCards$ButtonWithCardsPane.Actions getButtonWithCards() {
        if (this.outputCase_ == 108) {
            return (ButtonWithCards$ButtonWithCardsPane.Actions) this.output_;
        }
        return ButtonWithCards$ButtonWithCardsPane.Actions.getDefaultInstance();
    }

    public ButtonWithTable$ButtonWithTablePane.Actions getButtonWithTable() {
        if (this.outputCase_ == 109) {
            return (ButtonWithTable$ButtonWithTablePane.Actions) this.output_;
        }
        return ButtonWithTable$ButtonWithTablePane.Actions.getDefaultInstance();
    }

    public ButtonWithWebview$ButtonWithWebviewPane.Actions getButtonWithWebview() {
        if (this.outputCase_ == 110) {
            return (ButtonWithWebview$ButtonWithWebviewPane.Actions) this.output_;
        }
        return ButtonWithWebview$ButtonWithWebviewPane.Actions.getDefaultInstance();
    }

    public Challenge$ChallengePane.Actions getChallenge() {
        if (this.outputCase_ == 117) {
            return (Challenge$ChallengePane.Actions) this.output_;
        }
        return Challenge$ChallengePane.Actions.getDefaultInstance();
    }

    public Consent$ConsentPane.Actions getConsent() {
        if (this.outputCase_ == 104) {
            return (Consent$ConsentPane.Actions) this.output_;
        }
        return Consent$ConsentPane.Actions.getDefaultInstance();
    }

    public Credentials$CredentialsPane.Actions getCredentials() {
        if (this.outputCase_ == 103) {
            return (Credentials$CredentialsPane.Actions) this.output_;
        }
        return Credentials$CredentialsPane.Actions.getDefaultInstance();
    }

    public GridSelection$GridSelectionPane.Actions getGridSelection() {
        if (this.outputCase_ == 114) {
            return (GridSelection$GridSelectionPane.Actions) this.output_;
        }
        return GridSelection$GridSelectionPane.Actions.getDefaultInstance();
    }

    public HeadlessOAuth$HeadlessOAuthPane.Actions getHeadlessOAuth() {
        if (this.outputCase_ == 120) {
            return (HeadlessOAuth$HeadlessOAuthPane.Actions) this.output_;
        }
        return HeadlessOAuth$HeadlessOAuthPane.Actions.getDefaultInstance();
    }

    public Oauth$OAuthPane.Actions getOauth() {
        if (this.outputCase_ == 115) {
            return (Oauth$OAuthPane.Actions) this.output_;
        }
        return Oauth$OAuthPane.Actions.getDefaultInstance();
    }

    public OrderedList$OrderedListPane.Actions getOrderedList() {
        if (this.outputCase_ == 116) {
            return (OrderedList$OrderedListPane.Actions) this.output_;
        }
        return OrderedList$OrderedListPane.Actions.getDefaultInstance();
    }

    public b getOutputCase() {
        return b.forNumber(this.outputCase_);
    }

    public String getPaneNodeId() {
        return this.paneNodeId_;
    }

    public ByteString getPaneNodeIdBytes() {
        return ByteString.copyFromUtf8(this.paneNodeId_);
    }

    public String getPaneRenderingId() {
        return this.paneRenderingId_;
    }

    public ByteString getPaneRenderingIdBytes() {
        return ByteString.copyFromUtf8(this.paneRenderingId_);
    }

    public QrCode$QRCodePane.Actions getQrCode() {
        if (this.outputCase_ == 125) {
            return (QrCode$QRCodePane.Actions) this.output_;
        }
        return QrCode$QRCodePane.Actions.getDefaultInstance();
    }

    public SearchAndSelect$SearchAndSelectPane.Actions getSearchAndSelect() {
        if (this.outputCase_ == 111) {
            return (SearchAndSelect$SearchAndSelectPane.Actions) this.output_;
        }
        return SearchAndSelect$SearchAndSelectPane.Actions.getDefaultInstance();
    }

    public Sink$SinkPane.Actions getSink() {
        if (this.outputCase_ == 102) {
            return (Sink$SinkPane.Actions) this.output_;
        }
        return Sink$SinkPane.Actions.getDefaultInstance();
    }

    public Source$SourcePane.Actions getSource() {
        if (this.outputCase_ == 101) {
            return (Source$SourcePane.Actions) this.output_;
        }
        return Source$SourcePane.Actions.getDefaultInstance();
    }

    public UserInput$UserInputPane.Actions getUserInput() {
        if (this.outputCase_ == 112) {
            return (UserInput$UserInputPane.Actions) this.output_;
        }
        return UserInput$UserInputPane.Actions.getDefaultInstance();
    }

    public UserSelection$UserSelectionPane.Actions getUserSelection() {
        if (this.outputCase_ == 113) {
            return (UserSelection$UserSelectionPane.Actions) this.output_;
        }
        return UserSelection$UserSelectionPane.Actions.getDefaultInstance();
    }

    public boolean hasBetaAssetsUserSelection() {
        return this.outputCase_ == 122;
    }

    public boolean hasBetaButtonWithAccountList() {
        return this.outputCase_ == 124;
    }

    public boolean hasBetaButtonWithMultiTable() {
        return this.outputCase_ == 121;
    }

    public boolean hasBetaButtonWithTabularList() {
        return this.outputCase_ == 123;
    }

    public boolean hasBetaSwitchSearchAndSelect() {
        return this.outputCase_ == 119;
    }

    public boolean hasBetaUpload() {
        return this.outputCase_ == 118;
    }

    public boolean hasButton() {
        return this.outputCase_ == 105;
    }

    public boolean hasButtonList() {
        return this.outputCase_ == 106;
    }

    public boolean hasButtonWithAccordion() {
        return this.outputCase_ == 107;
    }

    public boolean hasButtonWithCards() {
        return this.outputCase_ == 108;
    }

    public boolean hasButtonWithTable() {
        return this.outputCase_ == 109;
    }

    public boolean hasButtonWithWebview() {
        return this.outputCase_ == 110;
    }

    public boolean hasChallenge() {
        return this.outputCase_ == 117;
    }

    public boolean hasConsent() {
        return this.outputCase_ == 104;
    }

    public boolean hasCredentials() {
        return this.outputCase_ == 103;
    }

    public boolean hasGridSelection() {
        return this.outputCase_ == 114;
    }

    public boolean hasHeadlessOAuth() {
        return this.outputCase_ == 120;
    }

    public boolean hasOauth() {
        return this.outputCase_ == 115;
    }

    public boolean hasOrderedList() {
        return this.outputCase_ == 116;
    }

    public boolean hasQrCode() {
        return this.outputCase_ == 125;
    }

    public boolean hasSearchAndSelect() {
        return this.outputCase_ == 111;
    }

    public boolean hasSink() {
        return this.outputCase_ == 102;
    }

    public boolean hasSource() {
        return this.outputCase_ == 101;
    }

    public boolean hasUserInput() {
        return this.outputCase_ == 112;
    }

    public boolean hasUserSelection() {
        return this.outputCase_ == 113;
    }

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Pane$PaneOutput, a> implements d {
        public a() {
            super(Pane$PaneOutput.DEFAULT_INSTANCE);
        }

        public a a(String str) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setPaneNodeId(str);
            return this;
        }

        public a b(String str) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setPaneRenderingId(str);
            return this;
        }

        public a a(Credentials$CredentialsPane.Actions.b bVar) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setCredentials(bVar.build());
            return this;
        }

        public a a(Consent$ConsentPane.Actions actions) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setConsent(actions);
            return this;
        }

        public a a(Consent$ConsentPane.Actions.b bVar) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setConsent(bVar.build());
            return this;
        }

        public a a(Button$ButtonPane.Actions.b bVar) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setButton(bVar.build());
            return this;
        }

        public a a(ButtonList$ButtonListPane.Actions.b bVar) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setButtonList(bVar.build());
            return this;
        }

        public a a(ButtonWithAccordion$ButtonWithAccordionPane.Actions.b bVar) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setButtonWithAccordion(bVar.build());
            return this;
        }

        public a a(ButtonWithCards$ButtonWithCardsPane.Actions.b bVar) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setButtonWithCards(bVar.build());
            return this;
        }

        public a a(ButtonWithTable$ButtonWithTablePane.Actions.b bVar) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setButtonWithTable(bVar.build());
            return this;
        }

        public a a(ButtonWithWebview$ButtonWithWebviewPane.Actions.b bVar) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setButtonWithWebview(bVar.build());
            return this;
        }

        public a a(SearchAndSelect$SearchAndSelectPane.Actions.b bVar) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setSearchAndSelect(bVar.build());
            return this;
        }

        public a a(UserInput$UserInputPane.Actions.b bVar) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setUserInput(bVar.build());
            return this;
        }

        public a a(UserSelection$UserSelectionPane.Actions.b bVar) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setUserSelection(bVar.build());
            return this;
        }

        public a a(GridSelection$GridSelectionPane.Actions.b bVar) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setGridSelection(bVar.build());
            return this;
        }

        public a a(Oauth$OAuthPane.Actions.b bVar) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setOauth(bVar.build());
            return this;
        }

        public a a(OrderedList$OrderedListPane.Actions.b bVar) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setOrderedList(bVar.build());
            return this;
        }

        public a a(Challenge$ChallengePane.Actions.b bVar) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setChallenge(bVar.build());
            return this;
        }

        public a a(HeadlessOAuth$HeadlessOAuthPane.Actions.b bVar) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setHeadlessOAuth(bVar.build());
            return this;
        }

        public a a(QrCode$QRCodePane.Actions.b bVar) {
            copyOnWrite();
            ((Pane$PaneOutput) this.instance).setQrCode(bVar.build());
            return this;
        }
    }

    public static a newBuilder(Pane$PaneOutput pane$PaneOutput) {
        return DEFAULT_INSTANCE.createBuilder(pane$PaneOutput);
    }

    public static Pane$PaneOutput parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PaneOutput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Pane$PaneOutput parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PaneOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Pane$PaneOutput parseFrom(ByteString byteString) {
        return (Pane$PaneOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Pane$PaneOutput parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PaneOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Pane$PaneOutput parseFrom(byte[] bArr) {
        return (Pane$PaneOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Pane$PaneOutput parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PaneOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Pane$PaneOutput parseFrom(InputStream inputStream) {
        return (Pane$PaneOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pane$PaneOutput parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PaneOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Pane$PaneOutput parseFrom(CodedInputStream codedInputStream) {
        return (Pane$PaneOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Pane$PaneOutput parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PaneOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}