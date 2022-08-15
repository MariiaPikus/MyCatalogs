import axios from 'axios'

const COLLECT_REST_API_URL = 'http://localhost:8080/collects';

class CollectService {

    getCollect() {
        return axios.get(COLLECT_REST_API_URL);
    }
}

export default new CollectService();