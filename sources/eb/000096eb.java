package org.godotengine.godot.input;

import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.godotengine.godot.GodotLib;
import org.godotengine.godot.GodotView;
import org.godotengine.godot.input.InputManagerCompat;

/* loaded from: classes5.dex */
public class GodotInputHandler implements InputManagerCompat.InputDeviceListener {
    private final GodotView godotView;
    private final InputManagerCompat inputManager;
    private final ArrayList<Joystick> joysticksDevices = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class RangeComparator implements Comparator<InputDevice.MotionRange> {
        private RangeComparator() {
        }

        @Override // java.util.Comparator
        public int compare(InputDevice.MotionRange motionRange, InputDevice.MotionRange motionRange2) {
            return motionRange.getAxis() - motionRange2.getAxis();
        }
    }

    public GodotInputHandler(GodotView godotView) {
        this.godotView = godotView;
        InputManagerCompat inputManager = InputManagerCompat.Factory.getInputManager(godotView.getContext());
        this.inputManager = inputManager;
        inputManager.registerInputDeviceListener(this, null);
    }

    private int findJoystickDevice(int i11) {
        for (int i12 = 0; i12 < this.joysticksDevices.size(); i12++) {
            if (this.joysticksDevices.get(i12).device_id == i11) {
                return i12;
            }
        }
        return -1;
    }

    public static int getGodotButton(int i11) {
        switch (i11) {
            case 19:
                return 11;
            case 20:
                return 12;
            case 21:
                return 13;
            case 22:
                return 14;
            default:
                switch (i11) {
                    case 96:
                        return 0;
                    case 97:
                        return 1;
                    case 98:
                        return 17;
                    case 99:
                        return 2;
                    case 100:
                        return 3;
                    case 101:
                        return 18;
                    case 102:
                        return 9;
                    case 103:
                        return 10;
                    case 104:
                        return 15;
                    case 105:
                        return 16;
                    case 106:
                        return 7;
                    case 107:
                        return 8;
                    case 108:
                        return 6;
                    case 109:
                        return 4;
                    default:
                        return (i11 - 188) + 20;
                }
        }
    }

    private boolean isKeyEvent_GameDevice(int i11) {
        if (i11 == 769) {
            return false;
        }
        return (i11 & 16777232) == 16777232 || (i11 & 513) == 513 || (i11 & 1025) == 1025;
    }

    private void queueEvent(Runnable runnable) {
        this.godotView.queueEvent(runnable);
    }

    public void initInputDevices() {
        int[] inputDeviceIds;
        for (int i11 : this.inputManager.getInputDeviceIds()) {
            this.inputManager.getInputDevice(i11);
            onInputDeviceAdded(i11);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 16777232) == 16777232 && motionEvent.getAction() == 2) {
            final int findJoystickDevice = findJoystickDevice(motionEvent.getDeviceId());
            if (findJoystickDevice > -1) {
                Joystick joystick = this.joysticksDevices.get(findJoystickDevice);
                for (final int i11 = 0; i11 < joystick.axes.size(); i11++) {
                    InputDevice.MotionRange motionRange = joystick.axes.get(i11);
                    final float axisValue = (((motionEvent.getAxisValue(motionRange.getAxis()) - motionRange.getMin()) / motionRange.getRange()) * 2.0f) - 1.0f;
                    queueEvent(new Runnable() { // from class: org.godotengine.godot.input.GodotInputHandler.5
                        @Override // java.lang.Runnable
                        public void run() {
                            GodotLib.joyaxis(findJoystickDevice, i11, axisValue);
                        }
                    });
                }
                for (int i12 = 0; i12 < joystick.hats.size(); i12 += 2) {
                    final int round = Math.round(motionEvent.getAxisValue(joystick.hats.get(i12).getAxis()));
                    final int round2 = Math.round(motionEvent.getAxisValue(joystick.hats.get(i12 + 1).getAxis()));
                    queueEvent(new Runnable() { // from class: org.godotengine.godot.input.GodotInputHandler.6
                        @Override // java.lang.Runnable
                        public void run() {
                            GodotLib.joyhat(findJoystickDevice, round, round2);
                        }
                    });
                }
                return true;
            }
        } else if ((motionEvent.getSource() & 16386) == 16386) {
            final int round3 = Math.round(motionEvent.getX());
            final int round4 = Math.round(motionEvent.getY());
            final int action = motionEvent.getAction();
            queueEvent(new Runnable() { // from class: org.godotengine.godot.input.GodotInputHandler.7
                @Override // java.lang.Runnable
                public void run() {
                    GodotLib.hover(action, round3, round4);
                }
            });
            return true;
        }
        return false;
    }

    @Override // org.godotengine.godot.input.InputManagerCompat.InputDeviceListener
    public void onInputDeviceAdded(int i11) {
        InputDevice inputDevice;
        if (findJoystickDevice(i11) >= 0 || (inputDevice = this.inputManager.getInputDevice(i11)) == null) {
            return;
        }
        int sources = inputDevice.getSources();
        if ((sources & 1025) == 1025 || (sources & 16777232) == 16777232) {
            final int size = this.joysticksDevices.size();
            Joystick joystick = new Joystick();
            joystick.device_id = i11;
            joystick.name = inputDevice.getName();
            joystick.axes = new ArrayList<>();
            joystick.hats = new ArrayList<>();
            List<InputDevice.MotionRange> motionRanges = inputDevice.getMotionRanges();
            Collections.sort(motionRanges, new RangeComparator());
            for (InputDevice.MotionRange motionRange : motionRanges) {
                if (motionRange.getAxis() != 15 && motionRange.getAxis() != 16) {
                    joystick.axes.add(motionRange);
                } else {
                    joystick.hats.add(motionRange);
                }
            }
            this.joysticksDevices.add(joystick);
            final String str = joystick.name;
            queueEvent(new Runnable() { // from class: org.godotengine.godot.input.GodotInputHandler.8
                @Override // java.lang.Runnable
                public void run() {
                    GodotLib.joyconnectionchanged(size, true, str);
                }
            });
        }
    }

    @Override // org.godotengine.godot.input.InputManagerCompat.InputDeviceListener
    public void onInputDeviceChanged(int i11) {
        onInputDeviceRemoved(i11);
        onInputDeviceAdded(i11);
    }

    @Override // org.godotengine.godot.input.InputManagerCompat.InputDeviceListener
    public void onInputDeviceRemoved(int i11) {
        final int findJoystickDevice = findJoystickDevice(i11);
        if (findJoystickDevice > -1) {
            this.joysticksDevices.remove(findJoystickDevice);
            queueEvent(new Runnable() { // from class: org.godotengine.godot.input.GodotInputHandler.9
                @Override // java.lang.Runnable
                public void run() {
                    GodotLib.joyconnectionchanged(findJoystickDevice, false, "");
                }
            });
        }
    }

    public boolean onKeyDown(final int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            this.godotView.onBackPressed();
            return true;
        } else if (i11 == 24 || i11 == 25) {
            return false;
        } else {
            if (isKeyEvent_GameDevice(keyEvent.getSource())) {
                if (keyEvent.getRepeatCount() > 0) {
                    return true;
                }
                final int godotButton = getGodotButton(i11);
                final int findJoystickDevice = findJoystickDevice(keyEvent.getDeviceId());
                if (findJoystickDevice > -1) {
                    queueEvent(new Runnable() { // from class: org.godotengine.godot.input.GodotInputHandler.3
                        @Override // java.lang.Runnable
                        public void run() {
                            GodotLib.joybutton(findJoystickDevice, godotButton, true);
                        }
                    });
                }
            } else {
                final int unicodeChar = keyEvent.getUnicodeChar(0);
                queueEvent(new Runnable() { // from class: org.godotengine.godot.input.GodotInputHandler.4
                    @Override // java.lang.Runnable
                    public void run() {
                        GodotLib.key(i11, unicodeChar, true);
                    }
                });
            }
            return true;
        }
    }

    public boolean onKeyUp(final int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            return true;
        }
        if (i11 == 24 || i11 == 25) {
            return false;
        }
        if (isKeyEvent_GameDevice(keyEvent.getSource())) {
            final int godotButton = getGodotButton(i11);
            final int findJoystickDevice = findJoystickDevice(keyEvent.getDeviceId());
            if (findJoystickDevice > -1) {
                queueEvent(new Runnable() { // from class: org.godotengine.godot.input.GodotInputHandler.1
                    @Override // java.lang.Runnable
                    public void run() {
                        GodotLib.joybutton(findJoystickDevice, godotButton, false);
                    }
                });
            }
        } else {
            final int unicodeChar = keyEvent.getUnicodeChar(0);
            queueEvent(new Runnable() { // from class: org.godotengine.godot.input.GodotInputHandler.2
                @Override // java.lang.Runnable
                public void run() {
                    GodotLib.key(i11, unicodeChar, false);
                }
            });
        }
        return true;
    }
}