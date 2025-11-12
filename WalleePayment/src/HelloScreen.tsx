import React from 'react';
import { View, Text, StyleSheet } from 'react-native';
import NativeTestingText from '../modulesSpecs/NativeTestingText';

const HelloScreen = () => {
  return (
    <View style={styles.container}>
      <Text style={styles.title}>👋 Hello, React Native!</Text>
      <Text style={styles.subtitle}>This is a basic screen example.</Text>
      <Text style={styles.subtitle}>MODULE TEST:</Text>
      <Text style={styles.subtitle}>{NativeTestingText.getSomeText()}</Text>
      <Text style={styles.subtitle}>
        {NativeTestingText.getSomeOtherText()}
      </Text>
      <Text style={styles.subtitle}>
        {NativeTestingText.getGreeting('John')}
      </Text>
      <Text style={styles.subtitle}>
        {NativeTestingText.getGreeting('Jane')}
      </Text>
      <Text style={styles.subtitle}>
        {NativeTestingText.getGreeting('Jim')}
      </Text>
      <Text style={styles.subtitle}>
        {NativeTestingText.getGreeting('Jill')}
      </Text>
      <Text style={styles.subtitle}>
        {NativeTestingText.getGreeting('Jack')}
      </Text>
      <Text style={styles.subtitle}>
        {NativeTestingText.getGreeting('Jill')}
      </Text>
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#f2f2f2',
  },
  title: {
    fontSize: 24,
    fontWeight: '600',
    color: '#333',
  },
  subtitle: {
    marginTop: 8,
    fontSize: 16,
    color: '#666',
  },
});

export default HelloScreen;
