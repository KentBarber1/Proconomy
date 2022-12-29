document.cookie = "cookiename=page;"

let current = 0;

VANTA.CLOUDS({
    el: "#CLOUDS",
    mouseControls: true,
    touchControls: true,
    gyroControls: false,
    minHeight: 200.00,
    minWidth: 200.00
  })


function submitForm() { // submits form
    document.getElementById("customForm").submit();
    window.location = "https://filedn.com/ldACOP4qsE9LXcFGPIRrAlR/NYELetter/Submitted.html";
    
}

function submit() {
    nameF = document.getElementById("formNameField").value;
    deptF = document.getElementById("dept").value;

    if (nameF == "") {
        alert('Please fill out the name!');
    } else {
        if (dept.value == "No") {
            alert("Please select a Dept/GY");
        } else {
            setTimeout("submitForm()", 3000); // set timout 
            
            btnText.innerHTML = "Thanks";
            btn.classList.add("active");
        }
    }

};


function updateText() {
    text = document.getElementById('magicText');
    texts = document.querySelectorAll('#texts span');
    
    let num = texts.length;

  let newText = texts[current].innerHTML;
  text.innerHTML = newText;
  (current < (num-1) ) ? current++ : current = 0;
}

setInterval( updateText, 3000 );

