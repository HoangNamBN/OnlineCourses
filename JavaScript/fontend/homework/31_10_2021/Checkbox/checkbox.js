function Check() {
    checkbox = document.getElementById("c1");
    nutbam = document.getElementById("sb");

    if (checkbox.checked) {
        // tắt thuộc tính disable của button
        nutbam.disabled = false;
    }
    else {
        nutbam.disabled = true;
    }
}