import type { TurboModule } from 'react-native';
import { TurboModuleRegistry, ToastAndroid } from 'react-native';

// console.log('NativeTestingText');

// console.log(
//   'NativeTestingText',
//   TurboModuleRegistry.getEnforcing('NativeTestingText'),
// );

const nativeTestingText =
  TurboModuleRegistry.getEnforcing<Spec>('NativeTestingText');

if (nativeTestingText) {
  ToastAndroid.show('NativeTestingText is available', ToastAndroid.SHORT);
} else {
  ToastAndroid.show('NativeTestingText is not available', ToastAndroid.SHORT);
}

export interface Spec extends TurboModule {
  getSomeText(): string;
  getSomeOtherText(): string;
  getGreeting(name: string): string;
}

export default nativeTestingText;
