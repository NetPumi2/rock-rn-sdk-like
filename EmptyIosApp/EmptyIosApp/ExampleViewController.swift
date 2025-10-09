//
//  ExampleViewController.swift
//  EmptyIosApp
//
//  Created by Lukas Salek on 09.10.2025.
//

import UIKit
import WalleePaymentReact // framework s ReactNativeBrownfield

class ExampleViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        view.backgroundColor = .systemBackground

        let button = UIButton(type: .system)
        button.setTitle("Open React Native Screen", for: .normal)
        button.addTarget(self, action: #selector(openReactNativeScreen), for: .touchUpInside)

        button.translatesAutoresizingMaskIntoConstraints = false
        view.addSubview(button)

        NSLayoutConstraint.activate([
            button.centerXAnchor.constraint(equalTo: view.centerXAnchor),
            button.centerYAnchor.constraint(equalTo: view.centerYAnchor)
        ])
    }

    @objc private func openReactNativeScreen() {
        // ⚡️ Zavolá React Native VC registrovaný přes AppRegistry.registerComponent(...)
        let reactNativeVC = ReactNativeViewController(moduleName: "WalleePayment")
        reactNativeVC.modalPresentationStyle = .fullScreen
        present(reactNativeVC, animated: true)
    }
}
