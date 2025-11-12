//
//  RCTNativeTestingText.m
//  WalleePayment
//
//  Created by Lukas Salek on 04.11.2025.
//

#import "RCTNativeTestingText.h"



@implementation RCTNativeTestingText


+ (NSString *)moduleName {
  return @"NativeTestingText";
}

- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:(const facebook::react::ObjCTurboModule::InitParams &)params {
  return std::make_shared<facebook::react::NativeTestingTextSpecJSI>(params);
}



- (NSString *)getSomeText {
  return @"Hello from React Native... getSomeText FCN";
}

- (NSString *)getSomeOtherText {
  return @"Lorem ipsum dolor sit amet, consectetur adipiscing elit. ... getSomeOtherText FCN";
}

- (NSString *)getGreeting:(NSString *)name {
  return [NSString stringWithFormat:@"Hello %@ !!!!!! getGreeting FCN", name ?: @""];
}

@end
