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
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation;
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
public final class Pane$PaneRendering extends GeneratedMessageLite<Pane$PaneRendering, a> implements e {
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
    private static final Pane$PaneRendering DEFAULT_INSTANCE;
    public static final int GRID_SELECTION_FIELD_NUMBER = 114;
    public static final int HEADLESS_O_AUTH_FIELD_NUMBER = 120;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAVIGATION_FIELD_NUMBER = 3;
    public static final int OAUTH_FIELD_NUMBER = 115;
    public static final int ORDERED_LIST_FIELD_NUMBER = 116;
    public static final int PANE_NODE_ID_FIELD_NUMBER = 2;
    private static volatile Parser<Pane$PaneRendering> PARSER = null;
    public static final int QR_CODE_FIELD_NUMBER = 125;
    public static final int RENDERING_PROPERTY_KEY_FIELD_NUMBER = 100;
    public static final int SANDBOX_MESSAGE_FIELD_NUMBER = 4;
    public static final int SEARCH_AND_SELECT_FIELD_NUMBER = 111;
    public static final int SINK_FIELD_NUMBER = 102;
    public static final int SOURCE_FIELD_NUMBER = 101;
    public static final int USER_INPUT_FIELD_NUMBER = 112;
    public static final int USER_SELECTION_FIELD_NUMBER = 113;
    private Pane$Navigation navigation_;
    private Object rendering_;
    private int renderingCase_ = 0;
    private String id_ = "";
    private String paneNodeId_ = "";
    private String sandboxMessage_ = "";
    private String renderingPropertyKey_ = "";

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
        RENDERING_NOT_SET(0);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f18388a;

        b(int i11) {
            this.f18388a = i11;
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
            return RENDERING_NOT_SET;
        }

        public int getNumber() {
            return this.f18388a;
        }

        @Deprecated
        public static b valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        Pane$PaneRendering pane$PaneRendering = new Pane$PaneRendering();
        DEFAULT_INSTANCE = pane$PaneRendering;
        GeneratedMessageLite.registerDefaultInstance(Pane$PaneRendering.class, pane$PaneRendering);
    }

    private Pane$PaneRendering() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBetaAssetsUserSelection() {
        if (this.renderingCase_ == 122) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBetaButtonWithAccountList() {
        if (this.renderingCase_ == 124) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBetaButtonWithMultiTable() {
        if (this.renderingCase_ == 121) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBetaButtonWithTabularList() {
        if (this.renderingCase_ == 123) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBetaSwitchSearchAndSelect() {
        if (this.renderingCase_ == 119) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBetaUpload() {
        if (this.renderingCase_ == 118) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButton() {
        if (this.renderingCase_ == 105) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonList() {
        if (this.renderingCase_ == 106) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonWithAccordion() {
        if (this.renderingCase_ == 107) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonWithCards() {
        if (this.renderingCase_ == 108) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonWithTable() {
        if (this.renderingCase_ == 109) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonWithWebview() {
        if (this.renderingCase_ == 110) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChallenge() {
        if (this.renderingCase_ == 117) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsent() {
        if (this.renderingCase_ == 104) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCredentials() {
        if (this.renderingCase_ == 103) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGridSelection() {
        if (this.renderingCase_ == 114) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeadlessOAuth() {
        if (this.renderingCase_ == 120) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigation() {
        this.navigation_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOauth() {
        if (this.renderingCase_ == 115) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrderedList() {
        if (this.renderingCase_ == 116) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaneNodeId() {
        this.paneNodeId_ = getDefaultInstance().getPaneNodeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQrCode() {
        if (this.renderingCase_ == 125) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRendering() {
        this.renderingCase_ = 0;
        this.rendering_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRenderingPropertyKey() {
        this.renderingPropertyKey_ = getDefaultInstance().getRenderingPropertyKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSandboxMessage() {
        this.sandboxMessage_ = getDefaultInstance().getSandboxMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchAndSelect() {
        if (this.renderingCase_ == 111) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSink() {
        if (this.renderingCase_ == 102) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        if (this.renderingCase_ == 101) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserInput() {
        if (this.renderingCase_ == 112) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserSelection() {
        if (this.renderingCase_ == 113) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    public static Pane$PaneRendering getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBetaAssetsUserSelection(BetaAssetsUserSelection$BetaAssetsUserSelectionPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ == 122 && this.rendering_ != BetaAssetsUserSelection$BetaAssetsUserSelectionPane.Rendering.getDefaultInstance()) {
            this.rendering_ = BetaAssetsUserSelection$BetaAssetsUserSelectionPane.Rendering.newBuilder((BetaAssetsUserSelection$BetaAssetsUserSelectionPane.Rendering) this.rendering_).mergeFrom((BetaAssetsUserSelection$BetaAssetsUserSelectionPane.Rendering.a) rendering).buildPartial();
        } else {
            this.rendering_ = rendering;
        }
        this.renderingCase_ = 122;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBetaButtonWithAccountList(BetaButtonWithAccountList$BetaButtonWithAccountListPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ == 124 && this.rendering_ != BetaButtonWithAccountList$BetaButtonWithAccountListPane.Rendering.getDefaultInstance()) {
            this.rendering_ = BetaButtonWithAccountList$BetaButtonWithAccountListPane.Rendering.newBuilder((BetaButtonWithAccountList$BetaButtonWithAccountListPane.Rendering) this.rendering_).mergeFrom((BetaButtonWithAccountList$BetaButtonWithAccountListPane.Rendering.b) rendering).buildPartial();
        } else {
            this.rendering_ = rendering;
        }
        this.renderingCase_ = 124;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBetaButtonWithMultiTable(BetaButtonWithMultiTable$BetaButtonWithMultiTablePane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ == 121 && this.rendering_ != BetaButtonWithMultiTable$BetaButtonWithMultiTablePane.Rendering.getDefaultInstance()) {
            this.rendering_ = BetaButtonWithMultiTable$BetaButtonWithMultiTablePane.Rendering.newBuilder((BetaButtonWithMultiTable$BetaButtonWithMultiTablePane.Rendering) this.rendering_).mergeFrom((BetaButtonWithMultiTable$BetaButtonWithMultiTablePane.Rendering.a) rendering).buildPartial();
        } else {
            this.rendering_ = rendering;
        }
        this.renderingCase_ = 121;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBetaButtonWithTabularList(BetaButtonWithTabularList$BetaButtonWithTabularListPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ == 123 && this.rendering_ != BetaButtonWithTabularList$BetaButtonWithTabularListPane.Rendering.getDefaultInstance()) {
            this.rendering_ = BetaButtonWithTabularList$BetaButtonWithTabularListPane.Rendering.newBuilder((BetaButtonWithTabularList$BetaButtonWithTabularListPane.Rendering) this.rendering_).mergeFrom((BetaButtonWithTabularList$BetaButtonWithTabularListPane.Rendering.a) rendering).buildPartial();
        } else {
            this.rendering_ = rendering;
        }
        this.renderingCase_ = 123;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBetaSwitchSearchAndSelect(BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ == 119 && this.rendering_ != BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane.Rendering.getDefaultInstance()) {
            this.rendering_ = BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane.Rendering.newBuilder((BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane.Rendering) this.rendering_).mergeFrom((BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane.Rendering.a) rendering).buildPartial();
        } else {
            this.rendering_ = rendering;
        }
        this.renderingCase_ = 119;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBetaUpload(BetaUpload$BetaUploadPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ == 118 && this.rendering_ != BetaUpload$BetaUploadPane.Rendering.getDefaultInstance()) {
            this.rendering_ = BetaUpload$BetaUploadPane.Rendering.newBuilder((BetaUpload$BetaUploadPane.Rendering) this.rendering_).mergeFrom((BetaUpload$BetaUploadPane.Rendering.a) rendering).buildPartial();
        } else {
            this.rendering_ = rendering;
        }
        this.renderingCase_ = 118;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeButton(Button$ButtonPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ == 105 && this.rendering_ != Button$ButtonPane.Rendering.getDefaultInstance()) {
            this.rendering_ = Button$ButtonPane.Rendering.newBuilder((Button$ButtonPane.Rendering) this.rendering_).mergeFrom((Button$ButtonPane.Rendering.a) rendering).buildPartial();
        } else {
            this.rendering_ = rendering;
        }
        this.renderingCase_ = 105;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeButtonList(ButtonList$ButtonListPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ == 106 && this.rendering_ != ButtonList$ButtonListPane.Rendering.getDefaultInstance()) {
            this.rendering_ = ButtonList$ButtonListPane.Rendering.newBuilder((ButtonList$ButtonListPane.Rendering) this.rendering_).mergeFrom((ButtonList$ButtonListPane.Rendering.a) rendering).buildPartial();
        } else {
            this.rendering_ = rendering;
        }
        this.renderingCase_ = 106;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeButtonWithAccordion(ButtonWithAccordion$ButtonWithAccordionPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ == 107 && this.rendering_ != ButtonWithAccordion$ButtonWithAccordionPane.Rendering.getDefaultInstance()) {
            this.rendering_ = ButtonWithAccordion$ButtonWithAccordionPane.Rendering.newBuilder((ButtonWithAccordion$ButtonWithAccordionPane.Rendering) this.rendering_).mergeFrom((ButtonWithAccordion$ButtonWithAccordionPane.Rendering.b) rendering).buildPartial();
        } else {
            this.rendering_ = rendering;
        }
        this.renderingCase_ = 107;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeButtonWithCards(ButtonWithCards$ButtonWithCardsPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ == 108 && this.rendering_ != ButtonWithCards$ButtonWithCardsPane.Rendering.getDefaultInstance()) {
            this.rendering_ = ButtonWithCards$ButtonWithCardsPane.Rendering.newBuilder((ButtonWithCards$ButtonWithCardsPane.Rendering) this.rendering_).mergeFrom((ButtonWithCards$ButtonWithCardsPane.Rendering.a) rendering).buildPartial();
        } else {
            this.rendering_ = rendering;
        }
        this.renderingCase_ = 108;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeButtonWithTable(ButtonWithTable$ButtonWithTablePane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ == 109 && this.rendering_ != ButtonWithTable$ButtonWithTablePane.Rendering.getDefaultInstance()) {
            this.rendering_ = ButtonWithTable$ButtonWithTablePane.Rendering.newBuilder((ButtonWithTable$ButtonWithTablePane.Rendering) this.rendering_).mergeFrom((ButtonWithTable$ButtonWithTablePane.Rendering.a) rendering).buildPartial();
        } else {
            this.rendering_ = rendering;
        }
        this.renderingCase_ = 109;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeButtonWithWebview(ButtonWithWebview$ButtonWithWebviewPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ == 110 && this.rendering_ != ButtonWithWebview$ButtonWithWebviewPane.Rendering.getDefaultInstance()) {
            this.rendering_ = ButtonWithWebview$ButtonWithWebviewPane.Rendering.newBuilder((ButtonWithWebview$ButtonWithWebviewPane.Rendering) this.rendering_).mergeFrom((ButtonWithWebview$ButtonWithWebviewPane.Rendering.a) rendering).buildPartial();
        } else {
            this.rendering_ = rendering;
        }
        this.renderingCase_ = 110;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChallenge(Challenge$ChallengePane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ == 117 && this.rendering_ != Challenge$ChallengePane.Rendering.getDefaultInstance()) {
            this.rendering_ = Challenge$ChallengePane.Rendering.newBuilder((Challenge$ChallengePane.Rendering) this.rendering_).mergeFrom((Challenge$ChallengePane.Rendering.a) rendering).buildPartial();
        } else {
            this.rendering_ = rendering;
        }
        this.renderingCase_ = 117;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConsent(Consent$ConsentPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ == 104 && this.rendering_ != Consent$ConsentPane.Rendering.getDefaultInstance()) {
            this.rendering_ = Consent$ConsentPane.Rendering.newBuilder((Consent$ConsentPane.Rendering) this.rendering_).mergeFrom((Consent$ConsentPane.Rendering.a) rendering).buildPartial();
        } else {
            this.rendering_ = rendering;
        }
        this.renderingCase_ = 104;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCredentials(Credentials$CredentialsPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ == 103 && this.rendering_ != Credentials$CredentialsPane.Rendering.getDefaultInstance()) {
            this.rendering_ = Credentials$CredentialsPane.Rendering.newBuilder((Credentials$CredentialsPane.Rendering) this.rendering_).mergeFrom((Credentials$CredentialsPane.Rendering.a) rendering).buildPartial();
        } else {
            this.rendering_ = rendering;
        }
        this.renderingCase_ = 103;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGridSelection(GridSelection$GridSelectionPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ == 114 && this.rendering_ != GridSelection$GridSelectionPane.Rendering.getDefaultInstance()) {
            this.rendering_ = GridSelection$GridSelectionPane.Rendering.newBuilder((GridSelection$GridSelectionPane.Rendering) this.rendering_).mergeFrom((GridSelection$GridSelectionPane.Rendering.a) rendering).buildPartial();
        } else {
            this.rendering_ = rendering;
        }
        this.renderingCase_ = 114;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHeadlessOAuth(HeadlessOAuth$HeadlessOAuthPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ == 120 && this.rendering_ != HeadlessOAuth$HeadlessOAuthPane.Rendering.getDefaultInstance()) {
            this.rendering_ = HeadlessOAuth$HeadlessOAuthPane.Rendering.newBuilder((HeadlessOAuth$HeadlessOAuthPane.Rendering) this.rendering_).mergeFrom((HeadlessOAuth$HeadlessOAuthPane.Rendering.a) rendering).buildPartial();
        } else {
            this.rendering_ = rendering;
        }
        this.renderingCase_ = 120;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNavigation(Pane$Navigation pane$Navigation) {
        pane$Navigation.getClass();
        Pane$Navigation pane$Navigation2 = this.navigation_;
        if (pane$Navigation2 != null && pane$Navigation2 != Pane$Navigation.getDefaultInstance()) {
            this.navigation_ = Pane$Navigation.newBuilder(this.navigation_).mergeFrom((Pane$Navigation.a) pane$Navigation).buildPartial();
        } else {
            this.navigation_ = pane$Navigation;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOauth(Oauth$OAuthPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ == 115 && this.rendering_ != Oauth$OAuthPane.Rendering.getDefaultInstance()) {
            this.rendering_ = Oauth$OAuthPane.Rendering.newBuilder((Oauth$OAuthPane.Rendering) this.rendering_).mergeFrom((Oauth$OAuthPane.Rendering.a) rendering).buildPartial();
        } else {
            this.rendering_ = rendering;
        }
        this.renderingCase_ = 115;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOrderedList(OrderedList$OrderedListPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ == 116 && this.rendering_ != OrderedList$OrderedListPane.Rendering.getDefaultInstance()) {
            this.rendering_ = OrderedList$OrderedListPane.Rendering.newBuilder((OrderedList$OrderedListPane.Rendering) this.rendering_).mergeFrom((OrderedList$OrderedListPane.Rendering.a) rendering).buildPartial();
        } else {
            this.rendering_ = rendering;
        }
        this.renderingCase_ = 116;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQrCode(QrCode$QRCodePane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ == 125 && this.rendering_ != QrCode$QRCodePane.Rendering.getDefaultInstance()) {
            this.rendering_ = QrCode$QRCodePane.Rendering.newBuilder((QrCode$QRCodePane.Rendering) this.rendering_).mergeFrom((QrCode$QRCodePane.Rendering.a) rendering).buildPartial();
        } else {
            this.rendering_ = rendering;
        }
        this.renderingCase_ = 125;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSearchAndSelect(SearchAndSelect$SearchAndSelectPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ == 111 && this.rendering_ != SearchAndSelect$SearchAndSelectPane.Rendering.getDefaultInstance()) {
            this.rendering_ = SearchAndSelect$SearchAndSelectPane.Rendering.newBuilder((SearchAndSelect$SearchAndSelectPane.Rendering) this.rendering_).mergeFrom((SearchAndSelect$SearchAndSelectPane.Rendering.a) rendering).buildPartial();
        } else {
            this.rendering_ = rendering;
        }
        this.renderingCase_ = 111;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSink(Sink$SinkPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ == 102 && this.rendering_ != Sink$SinkPane.Rendering.getDefaultInstance()) {
            this.rendering_ = Sink$SinkPane.Rendering.newBuilder((Sink$SinkPane.Rendering) this.rendering_).mergeFrom((Sink$SinkPane.Rendering.a) rendering).buildPartial();
        } else {
            this.rendering_ = rendering;
        }
        this.renderingCase_ = 102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSource(Source$SourcePane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ == 101 && this.rendering_ != Source$SourcePane.Rendering.getDefaultInstance()) {
            this.rendering_ = Source$SourcePane.Rendering.newBuilder((Source$SourcePane.Rendering) this.rendering_).mergeFrom((Source$SourcePane.Rendering.a) rendering).buildPartial();
        } else {
            this.rendering_ = rendering;
        }
        this.renderingCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserInput(UserInput$UserInputPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ == 112 && this.rendering_ != UserInput$UserInputPane.Rendering.getDefaultInstance()) {
            this.rendering_ = UserInput$UserInputPane.Rendering.newBuilder((UserInput$UserInputPane.Rendering) this.rendering_).mergeFrom((UserInput$UserInputPane.Rendering.a) rendering).buildPartial();
        } else {
            this.rendering_ = rendering;
        }
        this.renderingCase_ = 112;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserSelection(UserSelection$UserSelectionPane.Rendering rendering) {
        rendering.getClass();
        if (this.renderingCase_ == 113 && this.rendering_ != UserSelection$UserSelectionPane.Rendering.getDefaultInstance()) {
            this.rendering_ = UserSelection$UserSelectionPane.Rendering.newBuilder((UserSelection$UserSelectionPane.Rendering) this.rendering_).mergeFrom((UserSelection$UserSelectionPane.Rendering.a) rendering).buildPartial();
        } else {
            this.rendering_ = rendering;
        }
        this.renderingCase_ = 113;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Pane$PaneRendering parseDelimitedFrom(InputStream inputStream) {
        return (Pane$PaneRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pane$PaneRendering parseFrom(ByteBuffer byteBuffer) {
        return (Pane$PaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Pane$PaneRendering> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBetaAssetsUserSelection(BetaAssetsUserSelection$BetaAssetsUserSelectionPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 122;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBetaButtonWithAccountList(BetaButtonWithAccountList$BetaButtonWithAccountListPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 124;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBetaButtonWithMultiTable(BetaButtonWithMultiTable$BetaButtonWithMultiTablePane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 121;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBetaButtonWithTabularList(BetaButtonWithTabularList$BetaButtonWithTabularListPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 123;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBetaSwitchSearchAndSelect(BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 119;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBetaUpload(BetaUpload$BetaUploadPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 118;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButton(Button$ButtonPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 105;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonList(ButtonList$ButtonListPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 106;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonWithAccordion(ButtonWithAccordion$ButtonWithAccordionPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 107;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonWithCards(ButtonWithCards$ButtonWithCardsPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 108;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonWithTable(ButtonWithTable$ButtonWithTablePane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 109;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonWithWebview(ButtonWithWebview$ButtonWithWebviewPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 110;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChallenge(Challenge$ChallengePane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 117;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsent(Consent$ConsentPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 104;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCredentials(Credentials$CredentialsPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 103;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGridSelection(GridSelection$GridSelectionPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 114;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeadlessOAuth(HeadlessOAuth$HeadlessOAuthPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 120;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigation(Pane$Navigation pane$Navigation) {
        pane$Navigation.getClass();
        this.navigation_ = pane$Navigation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOauth(Oauth$OAuthPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 115;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrderedList(OrderedList$OrderedListPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 116;
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
    public void setQrCode(QrCode$QRCodePane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 125;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRenderingPropertyKey(String str) {
        str.getClass();
        this.renderingPropertyKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRenderingPropertyKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.renderingPropertyKey_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSandboxMessage(String str) {
        str.getClass();
        this.sandboxMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSandboxMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sandboxMessage_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchAndSelect(SearchAndSelect$SearchAndSelectPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 111;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSink(Sink$SinkPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(Source$SourcePane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserInput(UserInput$UserInputPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 112;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserSelection(UserSelection$UserSelectionPane.Rendering rendering) {
        rendering.getClass();
        this.rendering_ = rendering;
        this.renderingCase_ = 113;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (t7.f19513a[methodToInvoke.ordinal()]) {
            case 1:
                return new Pane$PaneRendering();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001e\u0001\u0000\u0001}\u001e\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t\u0004ȈdȈe<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000k<\u0000l<\u0000m<\u0000n<\u0000o<\u0000p<\u0000q<\u0000r<\u0000s<\u0000t<\u0000u<\u0000v<\u0000w<\u0000x<\u0000y<\u0000z<\u0000{<\u0000|<\u0000}<\u0000", new Object[]{"rendering_", "renderingCase_", "id_", "paneNodeId_", "navigation_", "sandboxMessage_", "renderingPropertyKey_", Source$SourcePane.Rendering.class, Sink$SinkPane.Rendering.class, Credentials$CredentialsPane.Rendering.class, Consent$ConsentPane.Rendering.class, Button$ButtonPane.Rendering.class, ButtonList$ButtonListPane.Rendering.class, ButtonWithAccordion$ButtonWithAccordionPane.Rendering.class, ButtonWithCards$ButtonWithCardsPane.Rendering.class, ButtonWithTable$ButtonWithTablePane.Rendering.class, ButtonWithWebview$ButtonWithWebviewPane.Rendering.class, SearchAndSelect$SearchAndSelectPane.Rendering.class, UserInput$UserInputPane.Rendering.class, UserSelection$UserSelectionPane.Rendering.class, GridSelection$GridSelectionPane.Rendering.class, Oauth$OAuthPane.Rendering.class, OrderedList$OrderedListPane.Rendering.class, Challenge$ChallengePane.Rendering.class, BetaUpload$BetaUploadPane.Rendering.class, BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane.Rendering.class, HeadlessOAuth$HeadlessOAuthPane.Rendering.class, BetaButtonWithMultiTable$BetaButtonWithMultiTablePane.Rendering.class, BetaAssetsUserSelection$BetaAssetsUserSelectionPane.Rendering.class, BetaButtonWithTabularList$BetaButtonWithTabularListPane.Rendering.class, BetaButtonWithAccountList$BetaButtonWithAccountListPane.Rendering.class, QrCode$QRCodePane.Rendering.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Pane$PaneRendering> parser = PARSER;
                if (parser == null) {
                    synchronized (Pane$PaneRendering.class) {
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

    public BetaAssetsUserSelection$BetaAssetsUserSelectionPane.Rendering getBetaAssetsUserSelection() {
        if (this.renderingCase_ == 122) {
            return (BetaAssetsUserSelection$BetaAssetsUserSelectionPane.Rendering) this.rendering_;
        }
        return BetaAssetsUserSelection$BetaAssetsUserSelectionPane.Rendering.getDefaultInstance();
    }

    public BetaButtonWithAccountList$BetaButtonWithAccountListPane.Rendering getBetaButtonWithAccountList() {
        if (this.renderingCase_ == 124) {
            return (BetaButtonWithAccountList$BetaButtonWithAccountListPane.Rendering) this.rendering_;
        }
        return BetaButtonWithAccountList$BetaButtonWithAccountListPane.Rendering.getDefaultInstance();
    }

    public BetaButtonWithMultiTable$BetaButtonWithMultiTablePane.Rendering getBetaButtonWithMultiTable() {
        if (this.renderingCase_ == 121) {
            return (BetaButtonWithMultiTable$BetaButtonWithMultiTablePane.Rendering) this.rendering_;
        }
        return BetaButtonWithMultiTable$BetaButtonWithMultiTablePane.Rendering.getDefaultInstance();
    }

    public BetaButtonWithTabularList$BetaButtonWithTabularListPane.Rendering getBetaButtonWithTabularList() {
        if (this.renderingCase_ == 123) {
            return (BetaButtonWithTabularList$BetaButtonWithTabularListPane.Rendering) this.rendering_;
        }
        return BetaButtonWithTabularList$BetaButtonWithTabularListPane.Rendering.getDefaultInstance();
    }

    public BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane.Rendering getBetaSwitchSearchAndSelect() {
        if (this.renderingCase_ == 119) {
            return (BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane.Rendering) this.rendering_;
        }
        return BetaSwitchSearchAndSelect$BetaSwitchSearchAndSelectPane.Rendering.getDefaultInstance();
    }

    public BetaUpload$BetaUploadPane.Rendering getBetaUpload() {
        if (this.renderingCase_ == 118) {
            return (BetaUpload$BetaUploadPane.Rendering) this.rendering_;
        }
        return BetaUpload$BetaUploadPane.Rendering.getDefaultInstance();
    }

    public Button$ButtonPane.Rendering getButton() {
        if (this.renderingCase_ == 105) {
            return (Button$ButtonPane.Rendering) this.rendering_;
        }
        return Button$ButtonPane.Rendering.getDefaultInstance();
    }

    public ButtonList$ButtonListPane.Rendering getButtonList() {
        if (this.renderingCase_ == 106) {
            return (ButtonList$ButtonListPane.Rendering) this.rendering_;
        }
        return ButtonList$ButtonListPane.Rendering.getDefaultInstance();
    }

    public ButtonWithAccordion$ButtonWithAccordionPane.Rendering getButtonWithAccordion() {
        if (this.renderingCase_ == 107) {
            return (ButtonWithAccordion$ButtonWithAccordionPane.Rendering) this.rendering_;
        }
        return ButtonWithAccordion$ButtonWithAccordionPane.Rendering.getDefaultInstance();
    }

    public ButtonWithCards$ButtonWithCardsPane.Rendering getButtonWithCards() {
        if (this.renderingCase_ == 108) {
            return (ButtonWithCards$ButtonWithCardsPane.Rendering) this.rendering_;
        }
        return ButtonWithCards$ButtonWithCardsPane.Rendering.getDefaultInstance();
    }

    public ButtonWithTable$ButtonWithTablePane.Rendering getButtonWithTable() {
        if (this.renderingCase_ == 109) {
            return (ButtonWithTable$ButtonWithTablePane.Rendering) this.rendering_;
        }
        return ButtonWithTable$ButtonWithTablePane.Rendering.getDefaultInstance();
    }

    public ButtonWithWebview$ButtonWithWebviewPane.Rendering getButtonWithWebview() {
        if (this.renderingCase_ == 110) {
            return (ButtonWithWebview$ButtonWithWebviewPane.Rendering) this.rendering_;
        }
        return ButtonWithWebview$ButtonWithWebviewPane.Rendering.getDefaultInstance();
    }

    public Challenge$ChallengePane.Rendering getChallenge() {
        if (this.renderingCase_ == 117) {
            return (Challenge$ChallengePane.Rendering) this.rendering_;
        }
        return Challenge$ChallengePane.Rendering.getDefaultInstance();
    }

    public Consent$ConsentPane.Rendering getConsent() {
        if (this.renderingCase_ == 104) {
            return (Consent$ConsentPane.Rendering) this.rendering_;
        }
        return Consent$ConsentPane.Rendering.getDefaultInstance();
    }

    public Credentials$CredentialsPane.Rendering getCredentials() {
        if (this.renderingCase_ == 103) {
            return (Credentials$CredentialsPane.Rendering) this.rendering_;
        }
        return Credentials$CredentialsPane.Rendering.getDefaultInstance();
    }

    public GridSelection$GridSelectionPane.Rendering getGridSelection() {
        if (this.renderingCase_ == 114) {
            return (GridSelection$GridSelectionPane.Rendering) this.rendering_;
        }
        return GridSelection$GridSelectionPane.Rendering.getDefaultInstance();
    }

    public HeadlessOAuth$HeadlessOAuthPane.Rendering getHeadlessOAuth() {
        if (this.renderingCase_ == 120) {
            return (HeadlessOAuth$HeadlessOAuthPane.Rendering) this.rendering_;
        }
        return HeadlessOAuth$HeadlessOAuthPane.Rendering.getDefaultInstance();
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public Pane$Navigation getNavigation() {
        Pane$Navigation pane$Navigation = this.navigation_;
        return pane$Navigation == null ? Pane$Navigation.getDefaultInstance() : pane$Navigation;
    }

    public Oauth$OAuthPane.Rendering getOauth() {
        if (this.renderingCase_ == 115) {
            return (Oauth$OAuthPane.Rendering) this.rendering_;
        }
        return Oauth$OAuthPane.Rendering.getDefaultInstance();
    }

    public OrderedList$OrderedListPane.Rendering getOrderedList() {
        if (this.renderingCase_ == 116) {
            return (OrderedList$OrderedListPane.Rendering) this.rendering_;
        }
        return OrderedList$OrderedListPane.Rendering.getDefaultInstance();
    }

    public String getPaneNodeId() {
        return this.paneNodeId_;
    }

    public ByteString getPaneNodeIdBytes() {
        return ByteString.copyFromUtf8(this.paneNodeId_);
    }

    public QrCode$QRCodePane.Rendering getQrCode() {
        if (this.renderingCase_ == 125) {
            return (QrCode$QRCodePane.Rendering) this.rendering_;
        }
        return QrCode$QRCodePane.Rendering.getDefaultInstance();
    }

    public b getRenderingCase() {
        return b.forNumber(this.renderingCase_);
    }

    public String getRenderingPropertyKey() {
        return this.renderingPropertyKey_;
    }

    public ByteString getRenderingPropertyKeyBytes() {
        return ByteString.copyFromUtf8(this.renderingPropertyKey_);
    }

    public String getSandboxMessage() {
        return this.sandboxMessage_;
    }

    public ByteString getSandboxMessageBytes() {
        return ByteString.copyFromUtf8(this.sandboxMessage_);
    }

    public SearchAndSelect$SearchAndSelectPane.Rendering getSearchAndSelect() {
        if (this.renderingCase_ == 111) {
            return (SearchAndSelect$SearchAndSelectPane.Rendering) this.rendering_;
        }
        return SearchAndSelect$SearchAndSelectPane.Rendering.getDefaultInstance();
    }

    public Sink$SinkPane.Rendering getSink() {
        if (this.renderingCase_ == 102) {
            return (Sink$SinkPane.Rendering) this.rendering_;
        }
        return Sink$SinkPane.Rendering.getDefaultInstance();
    }

    public Source$SourcePane.Rendering getSource() {
        if (this.renderingCase_ == 101) {
            return (Source$SourcePane.Rendering) this.rendering_;
        }
        return Source$SourcePane.Rendering.getDefaultInstance();
    }

    public UserInput$UserInputPane.Rendering getUserInput() {
        if (this.renderingCase_ == 112) {
            return (UserInput$UserInputPane.Rendering) this.rendering_;
        }
        return UserInput$UserInputPane.Rendering.getDefaultInstance();
    }

    public UserSelection$UserSelectionPane.Rendering getUserSelection() {
        if (this.renderingCase_ == 113) {
            return (UserSelection$UserSelectionPane.Rendering) this.rendering_;
        }
        return UserSelection$UserSelectionPane.Rendering.getDefaultInstance();
    }

    public boolean hasBetaAssetsUserSelection() {
        return this.renderingCase_ == 122;
    }

    public boolean hasBetaButtonWithAccountList() {
        return this.renderingCase_ == 124;
    }

    public boolean hasBetaButtonWithMultiTable() {
        return this.renderingCase_ == 121;
    }

    public boolean hasBetaButtonWithTabularList() {
        return this.renderingCase_ == 123;
    }

    public boolean hasBetaSwitchSearchAndSelect() {
        return this.renderingCase_ == 119;
    }

    public boolean hasBetaUpload() {
        return this.renderingCase_ == 118;
    }

    public boolean hasButton() {
        return this.renderingCase_ == 105;
    }

    public boolean hasButtonList() {
        return this.renderingCase_ == 106;
    }

    public boolean hasButtonWithAccordion() {
        return this.renderingCase_ == 107;
    }

    public boolean hasButtonWithCards() {
        return this.renderingCase_ == 108;
    }

    public boolean hasButtonWithTable() {
        return this.renderingCase_ == 109;
    }

    public boolean hasButtonWithWebview() {
        return this.renderingCase_ == 110;
    }

    public boolean hasChallenge() {
        return this.renderingCase_ == 117;
    }

    public boolean hasConsent() {
        return this.renderingCase_ == 104;
    }

    public boolean hasCredentials() {
        return this.renderingCase_ == 103;
    }

    public boolean hasGridSelection() {
        return this.renderingCase_ == 114;
    }

    public boolean hasHeadlessOAuth() {
        return this.renderingCase_ == 120;
    }

    public boolean hasNavigation() {
        return this.navigation_ != null;
    }

    public boolean hasOauth() {
        return this.renderingCase_ == 115;
    }

    public boolean hasOrderedList() {
        return this.renderingCase_ == 116;
    }

    public boolean hasQrCode() {
        return this.renderingCase_ == 125;
    }

    public boolean hasSearchAndSelect() {
        return this.renderingCase_ == 111;
    }

    public boolean hasSink() {
        return this.renderingCase_ == 102;
    }

    public boolean hasSource() {
        return this.renderingCase_ == 101;
    }

    public boolean hasUserInput() {
        return this.renderingCase_ == 112;
    }

    public boolean hasUserSelection() {
        return this.renderingCase_ == 113;
    }

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Pane$PaneRendering, a> implements e {
        public a() {
            super(Pane$PaneRendering.DEFAULT_INSTANCE);
        }

        public a a(String str) {
            copyOnWrite();
            ((Pane$PaneRendering) this.instance).setId(str);
            return this;
        }

        public a b(String str) {
            copyOnWrite();
            ((Pane$PaneRendering) this.instance).setPaneNodeId(str);
            return this;
        }

        public a a(Pane$Navigation pane$Navigation) {
            copyOnWrite();
            ((Pane$PaneRendering) this.instance).setNavigation(pane$Navigation);
            return this;
        }

        public a a(Button$ButtonPane.Rendering rendering) {
            copyOnWrite();
            ((Pane$PaneRendering) this.instance).setButton(rendering);
            return this;
        }
    }

    public static a newBuilder(Pane$PaneRendering pane$PaneRendering) {
        return DEFAULT_INSTANCE.createBuilder(pane$PaneRendering);
    }

    public static Pane$PaneRendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PaneRendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Pane$PaneRendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Pane$PaneRendering parseFrom(ByteString byteString) {
        return (Pane$PaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Pane$PaneRendering parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Pane$PaneRendering parseFrom(byte[] bArr) {
        return (Pane$PaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Pane$PaneRendering parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Pane$PaneRendering parseFrom(InputStream inputStream) {
        return (Pane$PaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pane$PaneRendering parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Pane$PaneRendering parseFrom(CodedInputStream codedInputStream) {
        return (Pane$PaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Pane$PaneRendering parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PaneRendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}