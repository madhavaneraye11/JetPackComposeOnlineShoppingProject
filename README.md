# Online Shopping Project (Jetpack Compose)

This is an Android application for an **Online Shopping platform** developed using **Jetpack Compose**, Google's modern UI toolkit for native Android development. The app allows users to browse products, add them to the shopping cart, and complete their purchase.

## Features

- **Browse Products**: View a variety of products available for purchase.
- **Product Details**: See detailed information about products, including price, description, and images.
- **Add to Cart**: Add selected products to the shopping cart.
- **Checkout**: Review your cart and complete the purchase.
- **User Authentication**: Sign up, sign in, and log out functionality for managing user accounts.
- **Dark/Light Mode Support**: The app supports both Dark and Light themes using Jetpack Compose’s theming capabilities.
- **Responsive UI**: The user interface adapts to various screen sizes and orientations.

## Tech Stack

- **Kotlin**: The primary language for Android development.
- **Jetpack Compose**: Modern UI toolkit for building native Android apps with declarative syntax.
- **Firebase Authentication**: For user authentication (sign up, sign in, sign out).
- **Firebase Firestore**: For storing product and user data.
- **Firebase Storage**: For storing images of products.
- **Coroutines**: For handling asynchronous tasks.
- **MVVM Architecture**: Model-View-ViewModel architecture for clean and maintainable code.
- **Navigation Component**: For navigating between different screens in the app.

## Installation

### Prerequisites

- **Android Studio** installed on your computer.
- **Kotlin** version 1.5 or higher.
- An active **Google Firebase** account for integrating Firebase services.

### Steps to Run the App

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/online-shopping-app.git
Sure! Here's an example of a **README.md** file for your **Online Shopping Project** using **Jetpack Compose**:

```markdown
# Online Shopping Project (Jetpack Compose)

This is an Android application for an **Online Shopping platform** developed using **Jetpack Compose**, Google's modern UI toolkit for native Android development. The app allows users to browse products, add them to the shopping cart, and complete their purchase.

## Features

- **Browse Products**: View a variety of products available for purchase.
- **Product Details**: See detailed information about products, including price, description, and images.
- **Add to Cart**: Add selected products to the shopping cart.
- **Checkout**: Review your cart and complete the purchase.
- **User Authentication**: Sign up, sign in, and log out functionality for managing user accounts.
- **Dark/Light Mode Support**: The app supports both Dark and Light themes using Jetpack Compose’s theming capabilities.
- **Responsive UI**: The user interface adapts to various screen sizes and orientations.

## Tech Stack

- **Kotlin**: The primary language for Android development.
- **Jetpack Compose**: Modern UI toolkit for building native Android apps with declarative syntax.
- **Firebase Authentication**: For user authentication (sign up, sign in, sign out).
- **Firebase Firestore**: For storing product and user data.
- **Firebase Storage**: For storing images of products.
- **Coroutines**: For handling asynchronous tasks.
- **MVVM Architecture**: Model-View-ViewModel architecture for clean and maintainable code.
- **Navigation Component**: For navigating between different screens in the app.

## Installation

### Prerequisites

- **Android Studio** installed on your computer.
- **Kotlin** version 1.5 or higher.
- An active **Google Firebase** account for integrating Firebase services.

### Steps to Run the App

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/online-shopping-app.git
   ```

2. Open the project in **Android Studio**.

3. Sync the project with Gradle by clicking on **Sync Now** in the top-right corner.

4. Set up Firebase in your project:
   - Go to the [Firebase Console](https://console.firebase.google.com/).
   - Create a new project and follow the setup steps.
   - Add Firebase Authentication, Firestore, and Firebase Storage to your project.
   - Download the **google-services.json** file and place it in the `app/` directory of your project.
   - Make sure to enable Firebase Authentication (Email/Password) and set up Firestore for storing product data.

5. Build and run the project on an emulator or a physical Android device.

## Screenshots

Here are some screenshots of the app:

| Screen               | Description                         |
| -------------------- | ----------------------------------- |
| ![Home Screen](assets/screenshots/home.png)  | Home screen with product list      |
| ![Product Details](assets/screenshots/product_details.png) | Product details screen            |
| ![Cart Screen](assets/screenshots/cart.png) | Shopping cart screen              |

## Architecture

This app uses **MVVM (Model-View-ViewModel)** architecture to separate concerns and improve code maintainability:

- **Model**: Data classes (Product, User, Order) and Firebase Firestore repository.
- **View**: Jetpack Compose UI components for rendering the user interface.
- **ViewModel**: Logic for managing the UI-related data and interacting with repositories.

## Contributing

We welcome contributions to improve the project! Please follow the steps below to contribute:

1. Fork the repository.
2. Create a new branch for your feature (`git checkout -b feature-name`).
3. Make your changes and commit them (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-name`).
5. Open a Pull Request with a description of the changes you've made.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- **Jetpack Compose**: For building native Android UIs with less code.
- **Firebase**: For providing authentication, storage, and real-time database solutions.
- **Kotlin**: For simplifying Android development with its concise syntax and powerful features.
- **Material Design**: For providing a consistent design system.

## Contact

- **Author**: Madhav Aneraye
- **Email**: madhavaneraye11@gmail.com
- **LinkedIn**: https://www.linkedin.com/in/madhav-aneraye-a152aa13a/

---
