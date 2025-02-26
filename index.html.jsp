
    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign In</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, sans-serif;
        }

        body {
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
            background-image: url("https://images.unsplash.com/photo-1497294815431-9365093b7331?q=80&w=2070&auto=format&fit=crop");
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
        }

        body::before {
            content: '';
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background: rgba(0, 0, 0, 0.5);
        }

        .signin-container {
            position: relative;
            width: 100%;
            max-width: 400px;
            padding: 40px;
            margin: 20px;
            background: rgba(255, 255, 255, 0.1);
            backdrop-filter: blur(10px);
            border-radius: 16px;
            box-shadow: 0 4px 30px rgba(0, 0, 0, 0.1);
        }

        .signin-header {
            text-align: center;
            margin-bottom: 40px;
        }

        .signin-header h1 {
            color: white;
            font-size: 28px;
            margin-bottom: 10px;
        }

        .signin-header p {
            color: #e5e5e5;
            font-size: 16px;
        }

        .form-group {
            margin-bottom: 20px;
        }

        .form-group label {
            display: block;
            color: #e5e5e5;
            margin-bottom: 8px;
            font-size: 14px;
        }

        .form-group input {
            width: 100%;
            padding: 12px 16px;
            background: rgba(255, 255, 255, 0.1);
            border: 1px solid rgba(255, 255, 255, 0.2);
            border-radius: 8px;
            color: white;
            font-size: 16px;
            outline: none;
            transition: border-color 0.3s ease;
        }

        .form-group input:focus {
            border-color: #3b82f6;
        }

        .form-group input::placeholder {
            color: rgba(255, 255, 255, 0.6);
        }

        .signin-button {
            width: 100%;
            padding: 12px;
            background: #3b82f6;
            border: none;
            border-radius: 8px;
            color: white;
            font-size: 16px;
            font-weight: 500;
            cursor: pointer;
            transition: background-color 0.3s ease, transform 0.2s ease;
        }

        .signin-button:hover {
            background: #2563eb;
            transform: translateY(-1px);
        }

        .signup-link {
            margin-top: 24px;
            text-align: center;
            color: #e5e5e5;
            font-size: 14px;
        }

        .signup-link a {
            color: #60a5fa;
            text-decoration: none;
            font-weight: 500;
            transition: color 0.3s ease;
        }

        .signup-link a:hover {
            color: #93c5fd;
        }

        @media (max-width: 480px) {
            .signin-container {
                padding: 30px 20px;
            }
        }
    </style>
</head>
<body>
    <div class="signin-container">
        <div class="signin-header">
            <h1>Welcome Back</h1>
            <p>Please sign in to continue</p>
        </div>
        
        <form action="login" method="post">
            <div class="form-group">
                <label for="username">Email</label>
                <input type="text" id="username" placeholder="Enter your Email" name="email"required>
            </div>
            
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" id="password" placeholder="Enter your password" name="password" required>
            </div>
            
            <button type="submit" class="signin-button">Sign In</button>
        </form>
        
        <div class="signup-link">
            Don't have an account? <a href="SignUp.jsp">Sign up</a>
        </div>
    </div>
</body>
</html>