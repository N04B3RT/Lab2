// Select elements from the DOM
const jokeContainer = document.getElementById('jokeContainer');
const fetchJokeBtn = document.getElementById('fetchJokeBtn');

// Event listener for fetching a joke
fetchJokeBtn.addEventListener('click', fetchJoke);

// Function to fetch joke from Chuck Norris Jokes API
function fetchJoke() {
    // Clear previous joke
    jokeContainer.innerHTML = '<p>Loading...</p>';

    // Fetch data from API
    fetch('https://api.chucknorris.io/jokes/random')
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            return response.json();
        })
        .then(data => {
            // Display joke on the webpage
            jokeContainer.innerHTML = `<p>${data.value}</p>`;
        })
        .catch(error => {
            console.error('Error fetching data:', error);
            jokeContainer.innerHTML = '<p>Failed to fetch joke. Please try again later.</p>';
        });
}
