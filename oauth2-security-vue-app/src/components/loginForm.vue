<template>
  <div class="login-container">
    <form action="/login" method="post">
      <label for="email"></label><input id="email" name="email" placeholder="Email" required type="email">
      <label for="password"></label><input id="password" name="password" placeholder="Password" required
                                           type="password">
      <button id="self_login" class="login-btn" type="submit">Log in</button>
    </form>
    <section id="social_login">
      <button id="google-login-btn" class="login-btn">Google</button>
      <button id="kakao-login-btn" class="login-btn">kakao</button>
    </section>
  </div>
</template>

<script>
window.onload = function () {
  document.getElementById('google-login-btn').addEventListener('click', function () {
    const client_id = '778075682082-6tkmcmtkh60nfo1dajbe6vvo97mhckob.apps.googleusercontent.com';
    const redirect_uri = 'http://localhost:8088/api/oauth/google';
    const scope = 'email profile';
    const response_type = 'code';
    window.open(`https://accounts.google.com/o/oauth2/v2/auth?client_id=${client_id}&redirect_uri=${redirect_uri}&scope=${scope}&response_type=${response_type}&access_type=online`, '_blank');
  });
}
</script>

<style>
body {
  font-family: Arial, sans-serif;
  background-color: #e8f5e9;
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
  margin: 0;
}

.login-container {
  width: 500px;
  background-color: white;
  padding: 20px;
  border-radius: 8px;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
  text-align: center;
}

input[type="email"], input[type="password"] {
  width: calc(100% - 20px);
  padding: 10px;
  margin: 10px 0;
  border: 1px solid #ccc;
  border-radius: 4px;
}

.login-btn {
  color: white;
  padding: 10px 20px;
  margin: 10px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  width: 100%;
}

.login-btn:hover {
  opacity: 0.8;
}

#social_login {
  display: flex;
  justify-content: space-between;
  margin-top: 20px;
}

#self_login {
  background-color: #4CAF50; /* Green */
}

#google-login-btn {
  background-color: #4CAF50; /* Green */
}

#kakao-login-btn {
  background-color: #FFEB00;
  color: black;
  margin-left: 15px;
}
</style>
