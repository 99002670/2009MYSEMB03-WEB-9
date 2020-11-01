class UserData {
    constructor(name, email, phone, password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    display() {
        console.log(
            "Name: " +
                this.name +
                "\n" +
                "Email: " +
                this.email +
                "\n" +
                "Phone: " +
                this.phone +
                "\n" +
                "Password: " +
                this.password +
                "\n"
        );
    }
}
