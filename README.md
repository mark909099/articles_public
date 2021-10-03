URL: http://tut1-env.eba-qsni3jse.us-east-1.elasticbeanstalk.com/

Pure backend Java project built with spring framework and MongoDB. Full CRUD operations.

detailed explanation:

Check "{URL}/api/articles" for GET, POST and DELETE requests.

Check "{URL}/api/articles/{id}" for GET and PUT of specific article id.

Check "{CURRENT_URL}/api/articles/new_to_old" for GET request sorted by year (high to low).

The JSON object format is:

{"title":"some string", "content":"some string 2", "year":some integer}