CREATE TABLE users (
                       user_id SERIAL PRIMARY KEY,
                       username VARCHAR(50) UNIQUE NOT NULL,
                       password VARCHAR(255) NOT NULL,
                       email VARCHAR(255) NOT NULL
);

CREATE TABLE questions (
                           question_id SERIAL PRIMARY KEY,
                           question_text TEXT NOT NULL,
                           question_category VARCHAR(50) NOT NULL
);

CREATE TABLE answers (
                         answer_id SERIAL PRIMARY KEY,
                         user_id INTEGER NOT NULL,
                         question_id INTEGER NOT NULL,
                         answer_text TEXT NOT NULL,
                         FOREIGN KEY (user_id) REFERENCES users(user_id),
                         FOREIGN KEY (question_id) REFERENCES questions(question_id)
);
