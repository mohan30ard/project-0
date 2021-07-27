const form = document.getElementById('form');

form.addEventListener('submit', e => {
    e.preventDefault()

    if (!checkInputs() ) {

        let url = "http://localhost:8080/bank_thor_v2/bank";
        fetch(url, {
            method: 'post',
            body: JSON.stringify({
                firstName: document.getElementById('fname').value,
                lastName: document.getElementById('lname').value,
                emailId: document.getElementById('emailid').value,
                mobileNumber: document.getElementById('mobilenumber').value,
                userId: document.getElementById('userid').value,
                password: document.getElementById('password').value
            }),
            headers: {
                'content-type': 'application/json; charset=UTF-8',
            }
        }).then(function (response) {
            alert("success");
            console.log("success");
            var results = document.getElementById('results')
            results.innerHTML = `<p>You have Succesfully Registered with Thor Bank V2.0 </p>
    <p><a href='/bank_thor_v2'>Click Here to LOGIN</a></p>`})
    }
    else {
        console.log("error");
        alert("error");
    }
})

function checkInputs() {
    console.log("hii");
    const firstName = document.getElementById('fname').value.trim();
    const lastName = document.getElementById('lname').value.trim();
    const emailId = document.getElementById('emailid').value.trim();
    const mobileNumber = document.getElementById('mobilenumber').value.trim();
    const userId = document.getElementById('userid').value.trim();
    const password1 = document.getElementById('password').value.trim();

    if (firstName === '') {
        setErrorFor(fname, 'Firstname Cannot be Empty');
    } else {
        setSuccessFor(fname);
    }

    if (lastName === '') {
        setErrorFor(lname, 'Lastname Cannot be Empty');
    } else {
        setSuccessFor(lname);
    }

    if (emailId === '') {
        setErrorFor(emailid, 'Email cannot be blank');
    } else if (!isEmail(emailId)) {
        setErrorFor(emailid, 'Not a valid email');
    } else {
        setSuccessFor(emailid);
    }

    if (mobileNumber === '') {
        setErrorFor(mobilenumber, 'Mobile Number cannot be blank');
    } else if (!isMobileNumber(mobilenumber)) {
        setErrorFor(mobilenumber, 'Not a valid MobileNumber');
    } else {
        setSuccessFor(mobilenumber);
    }

    if (userId === '') {
        setErrorFor(userid, 'userId Cannot be Empty');
    } else {
        setSuccessFor(userid);
    }

    if (password1 === '') {
        setErrorFor(password, 'Password cannot be blank');
    } else {
        setSuccessFor(password);
    }
}

function setErrorFor(input, message) {
    const formControl = input.parentElement;
    const small = formControl.querySelector('small');
    formControl.className = 'form-control error';
    small.innerText = message;
}

function setSuccessFor(input) {
    const formControl = input.parentElement;
    formControl.className = 'form-control success';
}

function isEmail(emailId) {
    return /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/.test(emailId);
}

function isMobileNumber(mobileNumber) {
    return /^\d{10}$/;
}


