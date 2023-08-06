import React, { useEffect, useState } from "react";
import axios from "axios";
import "./Movies.css";
import Youtube from "react-youtube";
import movieTrailer from "movie-trailer";

const API_KEY = "21a21987ccf635aab4d36b7ace0b1fb5";

function Movies(props) {
  const [movies, setMovies] = useState([]);
  const [isModalOpen, setIsModalOpen] = useState(false);
  const [trailerId, setTrailerId] = useState("");
  const [selectedMovieTitle, setSelectedMovieTitle] = useState(""); // New state for the selected movie title

  useEffect(() => {
    axios
      .get(
        `https://api.themoviedb.org/3/discover/movie?api_key=${API_KEY}&with_genres=${props.genreNo}`
      )
      .then((res) => {
        console.log(res.data.results);
        setMovies(res.data.results);
      })
      .catch((err) => console.log(err));
  }, []);

  const handleClick = (title) => {
    // movieTrailer(title, { id: true, multi: true })
      movieTrailer(title)
      .then((response) => {
        console.log(response);
        const videoId = new URLSearchParams(new URL(response).search).get("v");
        console.log(videoId);
        setTrailerId(videoId);
        setSelectedMovieTitle(title); // Set the selected movie title
        // setTrailerId(response[0]);
        setIsModalOpen(true);
      })
      .catch((err) => console.log(err));

  };

  const controls = {
    height: "300px",
    width: "600px",
    playerVars: {autoplay: 1},
  };

  return (
    <div>
      <h3 className="movie-list-title">{props.title}</h3>
      <div className="movie-list">
        {movies.map((movie) => {
          return (
            <div
              className="movie-container"
              onClick={() => handleClick(movie.title)}
            >
              <img
                className="movie-poster"
                src={`https://image.tmdb.org/t/p/original/${movie.poster_path}`}
                alt="movie poster"
              />
              <span className="movie-rating">Rating: {movie.vote_average}</span>
            </div>
          );
        })}
      </div>
      {isModalOpen && (
        <div className="modal" onClick={() => setIsModalOpen(false)}>
          <div>
            <h2>{selectedMovieTitle}</h2>
            <Youtube videoId={trailerId} opts={controls} />
          </div>
        </div>
      )}
    </div>
  );
}

export default Movies;