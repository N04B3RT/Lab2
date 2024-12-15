const quizForm = document.getElementById('quizForm');
const progressBar = document.getElementById('progressBar');
const questions = document.querySelectorAll('fieldset');
const totalQuestions = questions.length;
let currentQuestion = 0;
let score = 0;

// Initialize quiz
function startQuiz() {
    // Hide all questions except the first one
    questions.forEach((question, index) => {
        if (index !== 0) {
            question.style.display = 'none';
        }
    });
}

// Update progress bar
function updateProgress() {
    const percent = (currentQuestion / totalQuestions) * 100;
    progressBar.style.width = percent + '%';
}

// Show next question
function showNextQuestion() {
    questions[currentQuestion].style.display = 'none';
    currentQuestion++;
    if (currentQuestion < totalQuestions) {
        questions[currentQuestion].style.display = 'block';
        updateProgress();
    } else {
        finishQuiz();
    }
}
// Process submission of form
function processForm(e) {
    e.preventDefault();
    
    const selectedOption = document.querySelector(`input[name="q${currentQuestion + 1}"]:checked`);
    
    if (selectedOption) {
        const answer = selectedOption.value;
        checkAnswer(answer);
        showNextQuestion();
    }
}

// Check answer function
function checkAnswer(answer) {
    switch (currentQuestion) {
        case 0:
            if (answer === 'C') {
                score++;
            }
            break;
        case 1:
            if (answer === 'D') {
                score++;
            }
            break;
        case 2:
            if (answer === 'B') {
                score++;
            }
            break;
        case 3:
            if (answer === 'A') {
                score++;
            }
            break;
        case 4:
            if (answer === 'B') {
                score++;
            }
            break;
        case 5:
            if (answer === 'A') {
                score++;
            }
            break;
        default:
            break;
    }
}

// Finish quiz and display score
function finishQuiz() {
    document.getElementById("scoreDisplay").textContent = `Your score is ${score}`;
}

// Event listeners
quizForm.addEventListener('submit', processForm);

// Start quiz initially
startQuiz();
updateProgress();
