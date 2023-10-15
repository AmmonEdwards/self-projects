// Select all elements with the class "cell" and store them in the "cells" variable
const cells = document.querySelectorAll(".cell");

// Select the element with the ID "statusText" and store it in the "statusText" variable
const statusText = document.querySelector("#statusText");

// Select the element with the ID "restartBtn" and store it in the "restartBtn" variable
const restartBtn = document.querySelector("#restartBtn");

// Define an array of arrays representing win conditions for the game (rows, columns, diagonals)
const winConditions = [
    // Rows
    [0, 1, 2],
    [3, 4, 5],
    [6, 7, 8],
    // Columns
    [0, 3, 6],
    [1, 4, 7],
    [2, 5, 8],
    // Diagonals
    [0, 4, 8],
    [2, 4, 6]
];

// Create an array to track the state of each cell (empty or marked as "X" or "O")
let options = ["", "", "", "", "", "", "", "", ""];

// Initialize the current player as "X"
let currentPlayer = "X";

// Create a boolean variable to track whether the game is currently running
let running = false;

// Initialize the game when the script is loaded
initializeGame();

// Function to initialize the game
function initializeGame() {
    running = true;
    
    // Add a click event listener to each cell, calling the "cellClicked" function when clicked
    cells.forEach(cell => cell.addEventListener("click", cellClicked));
    
    // Add a click event listener to the restart button, calling the "restartGame" function when clicked
    restartBtn.addEventListener("click", restartGame);
    
    // Display the current player's turn in the status text element
    statusText.textContent = `${currentPlayer}'s turn`;
}

// Function to handle cell clicks
function cellClicked() {
    // Get the index of the clicked cell from its "cellIndex" attribute
    const cellIndex = this.getAttribute("cellIndex");

    // Check if the cell is already marked or the game is not running
    if (options[cellIndex] != "" || !running) {
        return;
    }

    // Update the clicked cell and check for a winner
    updateCell(this, cellIndex);
    checkWinner();
}

// Function to update a cell with the current player's mark
function updateCell(cell, index) {
    // Update the "options" array and set the cell's text content to the current player's mark
    options[index] = currentPlayer;
    cell.textContent = currentPlayer;
}

// Function to switch to the next player
function changePlayer() {
    // Toggle between "X" and "O" for the current player
    currentPlayer = (currentPlayer == "X") ? "O" : "X";
    statusText.textContent = `${currentPlayer}'s turn`;
}

// Function to check if there's a winner or a draw
function checkWinner() {
    let gameWon = false;

    for (let i = 0; i < winConditions.length; i++) {
        const condition = winConditions[i];
        const cellA = options[condition[0]];
        const cellB = options[condition[1]];
        const cellC = options[condition[2]];

        if (cellA == "" || cellB == "" || cellC == "") {
            continue;
        }
        if (cellA == cellB && cellB == cellC) {
            gameWon = true;
            break;
        }
    }

    if (gameWon) {
        statusText.textContent = `${currentPlayer} wins!`;
        running = false;
    } else if (!options.includes("")) {
        statusText.textContent = `Draw!`;
        running = false;
    } else {
        changePlayer();
    }
}

// Function to restart the game
function restartGame() {
    // Reset the current player to "X" and clear the cell state
    currentPlayer = "X";
    options = ["", "", "", "", "", "", "", "", ""];
    
    // Reset the status text and clear the content of all cells
    statusText.textContent = `${currentPlayer}'s turn`;
    cells.forEach(cell => cell.textContent = "");
    
    // Set the game as running
    running = true;
}
