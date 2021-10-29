import axios from 'axios'
export default class JobsService {
    getJobs() {
        return axios.get('http://localhost:8080/api/JobsAdvertisement/getAll')
    }
}