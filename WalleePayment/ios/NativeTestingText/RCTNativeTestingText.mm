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


- (NSString * _Nullable)getSomeText {
  return @"Hello from React Native... getSomeText FCN";
}

- (NSString * _Nullable)getSomeOtherText {
  return @"Lorem ipsum dolor sit amet, consectetur adipiscing elit. ... getSomeOtherText FCN";
}

- (NSString * _Nullable)getGreeting:(NSString * _Nullable)name {
  return [NSString stringWithFormat:@"Hello %@ !!!!!! getGreeting FCN", name ?: @""];
}

@end
