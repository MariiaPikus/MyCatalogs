import axios from 'axios'

const COLLECT_REST_API_URL = 'http://localhost:8080/collects';

class CollectService {

    getCollect() {
        return axios.get(COLLECT_REST_API_URL, 1000);
    }
}

export default new CollectService();